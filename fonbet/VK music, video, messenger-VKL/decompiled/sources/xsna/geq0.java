package xsna;

import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.ironsource.X3;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: UploadsSerialization.kt */
/* loaded from: classes4.dex */
public final class geq0 {
    public static final JSONObject a(UploadDto.UploadState uploadState) {
        String str;
        JSONObject jSONObject = new JSONObject();
        UploadDto.UploadStep uploadStep = uploadState.b;
        Parcelable parcelable = uploadState.h;
        if (uploadStep instanceof UploadDto.UploadStep.Failed) {
            str = SignalingProtocol.HUNGUP_REASON_FAILED;
        } else if (uploadStep.equals(UploadDto.UploadStep.Idle.b)) {
            str = "IDLE";
        } else if (uploadStep.equals(UploadDto.UploadStep.Uploaded.b)) {
            str = "UPLOADED";
        } else {
            if (!uploadStep.equals(UploadDto.UploadStep.Uploading.b)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "UPLOADING";
        }
        jSONObject.put("upload_step", str);
        jSONObject.putOpt("uri", uploadState.c);
        jSONObject.put("upload_id", uploadState.d);
        jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, uploadState.e);
        jSONObject.put(X3.i.l, uploadState.f);
        AttachmentType attachmentType = uploadState.g;
        jSONObject.putOpt("attach_type", attachmentType != null ? attachmentType.name() : null);
        if (parcelable instanceof PhotoAttachment) {
            JSONObject d = yq.d("type", "photo_attachment");
            d.put("value", ((PhotoAttachment) parcelable).Q3());
            s3q0 s3q0Var = s3q0.a;
            jSONObject.put("upload_result", d);
            return jSONObject;
        }
        if (parcelable instanceof VideoFile) {
            JSONObject d2 = yq.d("type", "video_file");
            d2.put("value", ((VideoFile) parcelable).e5());
            s3q0 s3q0Var2 = s3q0.a;
            jSONObject.put("upload_result", d2);
            return jSONObject;
        }
        if (parcelable instanceof VideoAttachment) {
            JSONObject d3 = yq.d("type", "video_attachment");
            d3.put("value", ((VideoAttachment) parcelable).Q3());
            s3q0 s3q0Var3 = s3q0.a;
            jSONObject.put("upload_result", d3);
        }
        return jSONObject;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final UploadDto.UploadState b(JSONObject jSONObject) {
        UploadDto.UploadStep uploadStep;
        UploadDto.UploadStep uploadStep2;
        AttachmentType attachmentType;
        Parcelable parcelable;
        Parcelable videoFileOld;
        Object obj;
        String D = f370.D(jSONObject, "upload_step");
        if (D != null) {
            switch (D.hashCode()) {
                case -1948348832:
                    if (D.equals("UPLOADED")) {
                        uploadStep2 = UploadDto.UploadStep.Uploaded.b;
                        uploadStep = uploadStep2;
                        break;
                    }
                    uploadStep = null;
                    break;
                case -269267423:
                    if (D.equals("UPLOADING")) {
                        uploadStep2 = UploadDto.UploadStep.Uploading.b;
                        uploadStep = uploadStep2;
                        break;
                    }
                    uploadStep = null;
                    break;
                case 2242516:
                    if (D.equals("IDLE")) {
                        uploadStep2 = UploadDto.UploadStep.Idle.b;
                        uploadStep = uploadStep2;
                        break;
                    }
                    uploadStep = null;
                    break;
                case 2066319421:
                    if (D.equals(SignalingProtocol.HUNGUP_REASON_FAILED)) {
                        uploadStep2 = new UploadDto.UploadStep.Failed(null);
                        uploadStep = uploadStep2;
                        break;
                    }
                    uploadStep = null;
                    break;
                default:
                    uploadStep = null;
                    break;
            }
            if (uploadStep != null) {
                String A = f370.A("uri", jSONObject);
                Integer x = f370.x(jSONObject, "upload_id");
                Integer x2 = f370.x(jSONObject, NotificationCompat.CATEGORY_PROGRESS);
                Integer x3 = f370.x(jSONObject, X3.i.l);
                String A2 = f370.A("attach_type", jSONObject);
                if (A2 != null) {
                    Iterator<E> it = AttachmentType.h().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (epx.f(((AttachmentType) obj).name(), A2)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    attachmentType = (AttachmentType) obj;
                } else {
                    attachmentType = null;
                }
                JSONObject jSONObject2 = jSONObject.has("upload_result") ? jSONObject.getJSONObject("upload_result") : null;
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString("type");
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("value");
                    if (jSONObject3 != null && string != null) {
                        int hashCode = string.hashCode();
                        if (hashCode != -1618268480) {
                            if (hashCode != 1248563047) {
                                if (hashCode == 1431960912 && string.equals("photo_attachment")) {
                                    videoFileOld = PhotoAttachment.Fb(jSONObject3);
                                    parcelable = videoFileOld;
                                }
                            } else if (string.equals("video_attachment")) {
                                videoFileOld = VideoAttachment.Gb(jSONObject3);
                                parcelable = videoFileOld;
                            }
                        } else if (string.equals("video_file")) {
                            videoFileOld = new VideoFileOld(jSONObject3);
                            parcelable = videoFileOld;
                        }
                    }
                    videoFileOld = null;
                    parcelable = videoFileOld;
                } else {
                    parcelable = null;
                }
                if (x != null && x2 != null && x3 != null) {
                    return new UploadDto.UploadState(uploadStep, A, x.intValue(), x2.intValue(), x3.intValue(), attachmentType, parcelable, false, 128, null);
                }
            }
        }
        return null;
    }
}
