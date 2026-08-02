package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.vk.core.serialize.Serializer;
import com.vk.crop.CropImageView;
import com.vk.dto.stories.model.clickable.ClickableMention;
import com.vk.log.L;
import com.vk.medianative.MediaImageEncoder;
import com.vk.superapp.api.dto.story.WebClickableZone;
import com.vk.superapp.api.dto.story.WebNativeSticker;
import com.vk.superapp.api.dto.story.WebRenderableSticker;
import com.vk.superapp.api.dto.story.WebServiceInfo;
import com.vk.superapp.api.dto.story.WebSticker;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.api.dto.story.WebStoryAttachment;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.superapp.api.dto.story.actions.StickerAction;
import com.vk.superapp.api.dto.story.actions.WebActionText;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.oap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class lfk implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lfk(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024e  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        byte[] decode;
        JSONObject jSONObject;
        ArrayList arrayList;
        Object obj;
        WebStoryAttachment webStoryAttachment;
        WebServiceInfo webServiceInfo;
        String absolutePath;
        ArrayList arrayList2;
        String a;
        String absolutePath2;
        int i = this.b;
        Bitmap bitmap = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                z4f z4fVar = ((com.vk.avatarpicker.a) obj2).b;
                int cropWidth = (int) ((CropImageView) z4fVar.invoke()).c.getCropWidth();
                CropImageView cropImageView = (CropImageView) z4fVar.invoke();
                com.vk.crop.b bVar = cropImageView.e;
                Bitmap bitmap2 = cropImageView.f;
                bVar.getClass();
                System.gc();
                System.gc();
                bfk bfkVar = bVar.c;
                com.vk.crop.g gVar = bVar.e;
                gVar.getClass();
                Matrix matrix = new Matrix();
                matrix.set(gVar.a);
                Paint paint = lik.a;
                float f = cropWidth;
                int cropAspectRatio = (int) (f / bfkVar.getCropAspectRatio());
                float f2 = f / cropAspectRatio;
                if (cropAspectRatio > cropWidth) {
                    cropAspectRatio = cropWidth;
                    cropWidth = (int) (f * f2);
                }
                Bitmap d = kd7.d(cropWidth, cropAspectRatio);
                if (d == null) {
                    L.G("can't crop bitmap");
                } else {
                    Matrix matrix2 = new Matrix(matrix);
                    float f3 = cropWidth;
                    float cropWidth2 = f3 / bfkVar.getCropWidth();
                    float cropWidth3 = (f3 - bfkVar.getCropWidth()) / 2.0f;
                    matrix2.postTranslate(cropWidth3, cropWidth3);
                    float f4 = cropWidth / 2;
                    matrix2.postScale(cropWidth2, cropWidth2, f4, f4);
                    matrix2.postTranslate((-bfkVar.getX0()) * cropWidth2, (-bfkVar.getY0()) * cropWidth2);
                    new Canvas(d).drawBitmap(bitmap2, matrix2, lik.a);
                    bitmap = d;
                }
                File s = com.vk.core.files.a.s();
                MediaImageEncoder.INSTANCE.encodeJpegWithoutCompression(bitmap, s);
                return Uri.fromFile(s);
            default:
                oap oapVar = (oap) obj2;
                if (oapVar instanceof oap.a) {
                    jSONObject = (JSONObject) ((oap.a) oapVar).a;
                } else {
                    if (!(oapVar instanceof oap.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str = (String) ((oap.b) oapVar).a;
                    try {
                        decode = Base64.decode(str, 0);
                    } catch (IllegalArgumentException unused) {
                        decode = Base64.decode(str, 10);
                    }
                    jSONObject = new JSONObject(new String(decode, emb.b));
                }
                Serializer.c<WebStoryBox> cVar = WebStoryBox.CREATOR;
                String optString = jSONObject.optString("background_type");
                String str2 = optString.length() == 0 ? "none" : optString;
                String A = f370.A("camera_type", jSONObject);
                String A2 = f370.A("url", jSONObject);
                String A3 = f370.A("blob", jSONObject);
                boolean optBoolean = jSONObject.optBoolean("locked", false);
                JSONArray optJSONArray = jSONObject.optJSONArray("stickers");
                if (optJSONArray != null) {
                    ArrayList arrayList3 = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                        if (optJSONObject != null) {
                            arrayList3.add(i35.j(optJSONObject));
                        }
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                if (A2 != null && A3 != null) {
                    throw new JSONException("You can't pass url and blob immediately");
                }
                if (A2 == null && A3 == null && !str2.equals("none")) {
                    throw new JSONException(zr.a("Background type ", str2, " require url or blob"));
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject(SharedKt.PARAM_ATTACHMENT);
                if (optJSONObject2 != null) {
                    Serializer.c<WebStoryAttachment> cVar2 = WebStoryAttachment.CREATOR;
                    String string = optJSONObject2.getString("text");
                    String string2 = optJSONObject2.getString("type");
                    if (!rl3.y0(new String[]{"url", "audio", "video", "photo"}).contains(string2)) {
                        throw new JSONException(go9.b("Attachment type not supported ", string2));
                    }
                    String optString2 = optJSONObject2.optString("url", null);
                    obj = "video";
                    long optLong = optJSONObject2.optLong("owner_id", 0L);
                    Long valueOf = optLong == 0 ? null : Long.valueOf(optLong);
                    int optInt = optJSONObject2.optInt("id", 0);
                    webStoryAttachment = new WebStoryAttachment(string, string2, optString2, valueOf, optInt == 0 ? null : Integer.valueOf(optInt), optJSONObject2.optString("access_key", null));
                } else {
                    obj = "video";
                    webStoryAttachment = null;
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("service_info");
                if (optJSONObject3 != null) {
                    Serializer.c<WebServiceInfo> cVar3 = WebServiceInfo.CREATOR;
                    String optString3 = optJSONObject3.optString("mask_id");
                    webServiceInfo = new WebServiceInfo(optString3.length() == 0 ? null : optString3, optJSONObject3.optBoolean("open_text_editor"), f370.x(optJSONObject3, "situational_suggest_id"), f370.q(optJSONObject3, "is_favorite"), f370.q(optJSONObject3, "allow_background_editor"), f370.x(optJSONObject3, "lifetime"), f370.q(optJSONObject3, "allow_camera"), f370.A("memory_date", optJSONObject3), f370.A("memory_type", optJSONObject3));
                } else {
                    webServiceInfo = null;
                }
                WebStoryBox webStoryBox = new WebStoryBox(str2, A, A2, A3, optBoolean, webStoryAttachment, arrayList, webServiceInfo);
                String str3 = webStoryBox.e;
                if (str3 == null) {
                    absolutePath = null;
                } else {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    File createTempFile = File.createTempFile("storybox_", ".blob", context.getCacheDir());
                    nbr.v(createTempFile, str3.getBytes(emb.b));
                    absolutePath = createTempFile.getAbsolutePath();
                }
                List<WebSticker> list = webStoryBox.h;
                if (list != null) {
                    List<WebSticker> list2 = list;
                    arrayList2 = new ArrayList(c5g.u(list2, 10));
                    for (Object obj3 : list2) {
                        if (obj3 instanceof WebRenderableSticker) {
                            WebRenderableSticker webRenderableSticker = (WebRenderableSticker) obj3;
                            String str4 = webRenderableSticker.f;
                            if (str4 == null) {
                                absolutePath2 = null;
                            } else {
                                Context context2 = e43.a;
                                if (context2 == null) {
                                    context2 = null;
                                }
                                File createTempFile2 = File.createTempFile("storybox_", ".blob", context2.getCacheDir());
                                nbr.v(createTempFile2, str4.getBytes(emb.b));
                                absolutePath2 = createTempFile2.getAbsolutePath();
                            }
                            obj3 = WebRenderableSticker.Ab(webRenderableSticker, null, absolutePath2, null, null, 507);
                        }
                        arrayList2.add(obj3);
                    }
                } else {
                    arrayList2 = null;
                }
                WebStoryBox zb = WebStoryBox.zb(webStoryBox, null, absolutePath, arrayList2, 183);
                HashMap hashMap = new HashMap();
                String str5 = zb.d;
                if (str5 != null) {
                    String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str5);
                    String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : null;
                    if (mimeTypeFromExtension != null) {
                        String str6 = zb.b;
                        if ((epx.f(str6, "image") || epx.f(str6, obj)) && !brm0.B(mimeTypeFromExtension, str6, false)) {
                            a = y57.a("Unexpected mime type: ", mimeTypeFromExtension, " for ", str6);
                            if (a == null) {
                                List<WebSticker> list3 = zb.h;
                                if (list3 != null) {
                                    for (WebSticker webSticker : list3) {
                                        if (webSticker instanceof WebNativeSticker) {
                                            WebNativeSticker webNativeSticker = (WebNativeSticker) webSticker;
                                            StickerAction stickerAction = webNativeSticker.e;
                                            if (stickerAction instanceof WebActionText) {
                                                String str7 = ((WebActionText) stickerAction).b;
                                                Regex regex = new Regex(Pattern.compile("#([a-zA-Zа-яА-ЯёЁ0-9_])+"));
                                                Regex regex2 = new Regex(ClickableMention.k);
                                                int g = rli0.g(Regex.d(regex, str7));
                                                int g2 = rli0.g(Regex.d(regex2, str7));
                                                ozl0.a(hashMap, WebStickerType.HASHTAG.i(), true, g);
                                                ozl0.a(hashMap, WebStickerType.MENTION.i(), true, g2);
                                            }
                                            ozl0.a(hashMap, webNativeSticker.d, true, 1);
                                        } else if (webSticker instanceof WebRenderableSticker) {
                                            WebRenderableSticker webRenderableSticker2 = (WebRenderableSticker) webSticker;
                                            if (epx.f(webRenderableSticker2.d, "gif")) {
                                                ozl0.a(hashMap, WebStickerType.GIF.i(), false, 1);
                                            }
                                            List<WebClickableZone> list4 = webRenderableSticker2.h;
                                            if (list4 != null) {
                                                Iterator<T> it = list4.iterator();
                                                while (it.hasNext()) {
                                                    ozl0.a(hashMap, ((WebClickableZone) it.next()).b, false, 1);
                                                }
                                            }
                                        }
                                    }
                                }
                                Iterator it2 = hashMap.entrySet().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it2.next();
                                        Pair pair = (Pair) entry.getKey();
                                        WebStickerType webStickerType = (WebStickerType) pair.d();
                                        boolean booleanValue = ((Boolean) pair.g()).booleanValue();
                                        int intValue = ((Number) entry.getValue()).intValue();
                                        if (o0m0.e(webStickerType)) {
                                            int d2 = webStickerType != WebStickerType.LINK ? o0m0.d(webStickerType) : booleanValue ? 1 : 3;
                                            if (intValue > d2) {
                                                a = booleanValue ? "You can't add action " + webStickerType.i() + " more than " + d2 + " inside native stickers" : "You can't add action " + webStickerType.i() + " more than " + d2 + " inside renderable stickers";
                                            }
                                        } else {
                                            a = "Not supported type " + webStickerType.i();
                                        }
                                    } else {
                                        a = null;
                                    }
                                }
                            }
                            if (a != null) {
                                return new Pair(zb, jSONObject.has("mini_app_id") ? Integer.valueOf(jSONObject.optInt("mini_app_id")) : null);
                            }
                            throw new JSONException(a);
                        }
                    }
                }
                a = null;
                if (a == null) {
                }
                if (a != null) {
                }
                break;
        }
    }
}
