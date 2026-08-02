package xsna;

import android.app.job.JobScheduler;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.a;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ironsource.adapters.vungle.VungleConstants;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.messages.MsgTextFormatItem;
import com.vk.dto.photo.Photo;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.dv90;
import xsna.x2o0;

/* compiled from: AuthValidatePhoneCheckMapper.kt */
@vby
/* loaded from: classes6.dex */
public final class w65 implements abk0, dv90.a, gn60 {
    public static final jai c = new jai(1959181099, new msh(2), false);
    public static final his0 d = new his0();
    public static final w65 e = new w65(4);
    public static final w65 f = new w65(5);
    public static final w65 g = new w65(6);
    public final /* synthetic */ int b;

    public /* synthetic */ w65(int i) {
        this.b = i;
    }

    public static final slv0 c(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, Integer num3, String str6, Integer num4, String str7, Integer num5, String str8, Integer num6, String str9, Integer num7, String str10, Integer num8, String str11, Integer num9, String str12, Integer num10, String str13, Integer num11, String str14, Integer num12, String str15, Integer num13, String str16, Integer num14, String str17, Integer num15, String str18, Integer num16) {
        slv0 slv0Var;
        synchronized (slv0.f) {
            try {
                slv0Var = slv0.h;
                if (slv0Var != null) {
                    slv0.h = slv0Var.d;
                    slv0Var.d = null;
                    slv0.g--;
                } else {
                    slv0Var = new slv0();
                }
                slv0Var.a = "oneevent.events.event.dev_null_item.flow";
                slv0Var.b = VungleConstants.META_DATA_VUNGLE_CONSENT_MESSAGE_VERSION;
                slv0Var.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        slv0Var.a(str, "key");
        if (str2 != null) {
            slv0Var.a(str2, "json");
        }
        if (str3 != null) {
            slv0Var.a(str3, "value_str");
        }
        if (num != null) {
            en.f(num, slv0Var, "value");
        }
        if (str4 != null) {
            slv0Var.a(str4, "value_str2");
        }
        if (num2 != null) {
            en.f(num2, slv0Var, "value2");
        }
        if (str5 != null) {
            slv0Var.a(str5, "value_str3");
        }
        if (num3 != null) {
            en.f(num3, slv0Var, "value3");
        }
        if (str6 != null) {
            slv0Var.a(str6, "value_str4");
        }
        if (num4 != null) {
            en.f(num4, slv0Var, "value4");
        }
        if (str7 != null) {
            slv0Var.a(str7, "value_str5");
        }
        if (num5 != null) {
            en.f(num5, slv0Var, "value5");
        }
        if (str8 != null) {
            slv0Var.a(str8, "value_str6");
        }
        if (num6 != null) {
            en.f(num6, slv0Var, "value6");
        }
        if (str9 != null) {
            slv0Var.a(str9, "value_str7");
        }
        if (num7 != null) {
            en.f(num7, slv0Var, "value7");
        }
        if (str10 != null) {
            slv0Var.a(str10, "value_str8");
        }
        if (num8 != null) {
            en.f(num8, slv0Var, "value8");
        }
        if (str11 != null) {
            slv0Var.a(str11, "value_str9");
        }
        if (num9 != null) {
            en.f(num9, slv0Var, "value9");
        }
        if (str12 != null) {
            slv0Var.a(str12, "value_str10");
        }
        if (num10 != null) {
            en.f(num10, slv0Var, "value10");
        }
        if (str13 != null) {
            slv0Var.a(str13, "value_str11");
        }
        if (num11 != null) {
            en.f(num11, slv0Var, "value11");
        }
        if (str14 != null) {
            slv0Var.a(str14, "value_str12");
        }
        if (num12 != null) {
            en.f(num12, slv0Var, "value12");
        }
        if (str15 != null) {
            slv0Var.a(str15, "value_str13");
        }
        if (num13 != null) {
            en.f(num13, slv0Var, "value13");
        }
        if (str16 != null) {
            slv0Var.a(str16, "value_str14");
        }
        if (num14 != null) {
            en.f(num14, slv0Var, "value14");
        }
        if (str17 != null) {
            slv0Var.a(str17, "value_str15");
        }
        if (num15 != null) {
            en.f(num15, slv0Var, "value15");
        }
        if (str18 != null) {
            slv0Var.a(str18, "value_str16");
        }
        if (num16 != null) {
            en.f(num16, slv0Var, "value16");
        }
        return slv0Var;
    }

    public static final float d(PostingPreviewRatio postingPreviewRatio) {
        return postingPreviewRatio.b / postingPreviewRatio.c;
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final ImageSize f(Image image) {
        ArrayList arrayList = image.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            com.vk.dto.common.im.Image image2 = ((ImageSize) next).d;
            if (image2.b >= 0 || image2.c >= 0) {
                if (mcr0.p(image2.d)) {
                    arrayList2.add(next);
                }
            }
        }
        return (ImageSize) ixj0.b(arrayList2);
    }

    public static JobScheduler g(JobScheduler jobScheduler) {
        JobScheduler forNamespace;
        forNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        return forNamespace;
    }

    public static final float h(View view) {
        return (view.getWidth() - view.getHeight()) / 2.0f;
    }

    public static final MediaStoreEntry i(PhotoAttachment photoAttachment) {
        return photoAttachment instanceof LocalPhotoAttachment ? ((LocalPhotoAttachment) photoAttachment).y.ba() : new MediaStoreImageEntry(photoAttachment.f, Uri.parse(photoAttachment.l.t), 0L, photoAttachment.p, photoAttachment.q, 0L, 0L, 0);
    }

    public static final MediaStoreImageEntry j(Photo photo) {
        int i = photo.c;
        Uri parse = Uri.parse(photo.t);
        long j = photo.g;
        Image image = photo.y;
        ImageSize imageSize = (ImageSize) j5g.a0(image.b);
        int i2 = imageSize != null ? imageSize.d.b : 0;
        ImageSize imageSize2 = (ImageSize) j5g.a0(image.b);
        return new MediaStoreImageEntry(i, parse, j, i2, imageSize2 != null ? imageSize2.d.c : 0, photo.g, 0L, 0);
    }

    public static final ao20 k() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1196684940, 0, -1, "com.vk.core.compose.component.defaults.<get-VkSnackbarDefaults> (VkSnackbarDefaults.kt:15)");
        }
        ao20 ao20Var = ao20.c;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return ao20Var;
    }

    public static final boolean l(ImageCropArea imageCropArea, ImageCropArea imageCropArea2) {
        return Math.abs((((float) imageCropArea.f) / ((float) imageCropArea.g)) - (((float) imageCropArea2.f) / ((float) imageCropArea2.g))) <= 0.04f;
    }

    public static final boolean m(ImageCropArea imageCropArea, PostingPreviewRatio postingPreviewRatio) {
        return Math.abs((((float) imageCropArea.f) / ((float) imageCropArea.g)) - d(postingPreviewRatio)) <= 0.04f;
    }

    public static List n(ArrayList arrayList) {
        if (arrayList.size() < 2) {
            return arrayList;
        }
        sk3 sk3Var = new sk3();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            MsgTextFormatItem msgTextFormatItem = (MsgTextFormatItem) obj;
            if (msgTextFormatItem.b >= 0 && msgTextFormatItem.c > 0) {
                arrayList2.add(obj);
            }
        }
        List D0 = j5g.D0(new fzr(2), arrayList2);
        MsgTextFormatItem msgTextFormatItem2 = (MsgTextFormatItem) j5g.Y(D0);
        sk3Var.addLast(msgTextFormatItem2);
        String str = msgTextFormatItem2.d;
        for (MsgTextFormatItem msgTextFormatItem3 : j5g.S(D0, 1)) {
            MsgTextFormatItem msgTextFormatItem4 = (MsgTextFormatItem) sk3Var.last();
            int i = msgTextFormatItem3.b;
            int i2 = msgTextFormatItem3.b;
            int i3 = msgTextFormatItem4.b + msgTextFormatItem4.c;
            int i4 = msgTextFormatItem4.b;
            if (i > i3) {
                sk3Var.addLast(msgTextFormatItem3);
            } else {
                sk3Var.removeLast();
                int min = Math.min(i2, i4);
                sk3Var.addLast(new MsgTextFormatItem(min, Math.max(i2 + msgTextFormatItem3.c, i4 + msgTextFormatItem4.c) - min, str, msgTextFormatItem3.e));
            }
        }
        return j5g.O0(sk3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fqw0 o(String str, JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        JSONObject jSONObject2;
        boolean has;
        boolean z4;
        Long l;
        boolean z5;
        boolean z6;
        JSONObject optJSONObject = jSONObject.optJSONObject("caller_info");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject3 = optJSONObject;
        String optString = jSONObject3.optString("user_id", jSONObject.optString("from_id"));
        String string = jSONObject.getString("conversation_params");
        String optString2 = jSONObject.optString("payload");
        String optString3 = jSONObject.optString("answer_from");
        boolean optBoolean = jSONObject.optBoolean(ApiProtocol.KEY_P2P_FORBIDDEN, true);
        if (myc0.f(optString2)) {
            try {
                jSONObject2 = new JSONObject(Html.fromHtml(optString2).toString());
                z = jSONObject2.optBoolean("is_video");
            } catch (Exception e2) {
                e = e2;
                z = false;
            }
            try {
                z2 = jSONObject2.optBoolean("join_by_link");
            } catch (Exception e3) {
                e = e3;
                L.A("OKVoipMsgParser", "Failed to read payload from incoming push", e);
                com.vk.metrics.eventtracking.b.a.q(e);
                z2 = false;
                z3 = z;
                String optString4 = jSONObject3.optString("first_name", GrsBaseInfo.CountryCodeSource.UNKNOWN);
                String optString5 = jSONObject3.optString("last_name", "");
                String optString6 = jSONObject3.optString("photo_400", "");
                if (jSONObject3.optInt("sex", 0) != 1) {
                }
                boolean optBoolean2 = jSONObject3.optBoolean("verified");
                boolean z7 = z2;
                boolean optBoolean3 = jSONObject3.optBoolean("is_nft", false);
                has = jSONObject.has("chat_info");
                if (has) {
                }
                String str2 = optString4;
                String str3 = optString6;
                StringBuilder e4 = fw3.e(str2);
                e4.append(drm0.N(optString5) ? "" : " ".concat(optString5));
                if (has) {
                }
                if (l == null) {
                    return new fqw0(new zqk0(null, (l == null && (l = arm0.n(optString)) == null) ? 0L : l.longValue(), str2, e4.toString(), str3, z6, z5, Collections.singleton(optString), !has || (myc0.f(optString3) && z7), null, null, null, null, 0, false, null, null, null, false, false, z4, 2096641), str, optString, z3, string, optBoolean, optString3);
                }
                return new fqw0(new zqk0(null, (l == null && (l = arm0.n(optString)) == null) ? 0L : l.longValue(), str2, e4.toString(), str3, z6, z5, Collections.singleton(optString), !has || (myc0.f(optString3) && z7), null, null, null, null, 0, false, null, null, null, false, false, z4, 2096641), str, optString, z3, string, optBoolean, optString3);
            }
            z3 = z;
        } else {
            z2 = false;
            z3 = false;
        }
        String optString42 = jSONObject3.optString("first_name", GrsBaseInfo.CountryCodeSource.UNKNOWN);
        String optString52 = jSONObject3.optString("last_name", "");
        String optString62 = jSONObject3.optString("photo_400", "");
        boolean z8 = jSONObject3.optInt("sex", 0) != 1;
        boolean optBoolean22 = jSONObject3.optBoolean("verified");
        boolean z72 = z2;
        boolean optBoolean32 = jSONObject3.optBoolean("is_nft", false);
        has = jSONObject.has("chat_info");
        if (has) {
            z4 = optBoolean32;
            l = null;
            z5 = optBoolean22;
            z6 = z8;
        } else {
            JSONObject jSONObject4 = jSONObject.getJSONObject("chat_info");
            optString42 = jSONObject4.optString("title", "");
            optString62 = jSONObject4.optString("photo_base", jSONObject4.optString("photo_400"));
            l = Long.valueOf(2000000000 + jSONObject4.getLong("chat_id"));
            optString52 = "";
            z6 = false;
            z5 = false;
            z4 = false;
        }
        String str22 = optString42;
        String str32 = optString62;
        StringBuilder e42 = fw3.e(str22);
        e42.append(drm0.N(optString52) ? "" : " ".concat(optString52));
        return new fqw0(new zqk0(null, (l == null && (l = arm0.n(optString)) == null) ? 0L : l.longValue(), str22, e42.toString(), str32, z6, z5, Collections.singleton(optString), !has || (myc0.f(optString3) && z72), null, null, null, null, 0, false, null, null, null, false, false, z4, 2096641), str, optString, z3, string, optBoolean, optString3);
    }

    public static final lg90 p(Drawable drawable, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(793729891, i, -1, "com.vk.core.compose.image.drawable.rememberDrawablePainter (rememberDrawablePainter.kt:14)");
        }
        boolean J = aVar.J(drawable);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            if (drawable == null) {
                x = ugp.g;
            } else {
                x = drawable instanceof BitmapDrawable ? new rc7(new aa2(((BitmapDrawable) drawable).getBitmap())) : drawable instanceof ColorDrawable ? new y6g(f870.c(((ColorDrawable) drawable).getColor())) : new yjo(drawable.mutate());
            }
            aVar.R(x);
        }
        lg90 lg90Var = (lg90) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return lg90Var;
    }

    public static final void q(TextView textView, lvi0 lvi0Var, boolean z) {
        CharSequence f2;
        boolean z2 = lvi0Var.b;
        List<SessionRoomParticipantModel> list = lvi0Var.d;
        if ((list != null ? list.size() : 0) == 0) {
            f2 = textView.getContext().getString((z || lvi0Var.a.c) ? R.string.voip_session_room_participant_empty : R.string.voip_session_room_admin_select_participants);
        } else if (z2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String string = textView.getContext().getString(R.string.voip_session_room_participant_count_with_assistance_request_head);
            spannableStringBuilder.append((CharSequence) string);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(dhr0.t.c(R.attr.vk_ui_accent_orange)), 0, string.length(), 0);
            spannableStringBuilder.append((CharSequence) enj.f(R.plurals.voip_session_room_participant_count_with_assistance_request_tail, list != null ? list.size() : 0, textView.getContext()));
            f2 = new SpannableString(spannableStringBuilder);
        } else {
            f2 = enj.f(R.plurals.voip_session_room_participant_count, list != null ? list.size() : 0, textView.getContext());
        }
        textView.setText(f2);
        if (!z2) {
            his0.v(textView, 0, 0);
        } else {
            textView.setCompoundDrawablePadding(cn70.b(6));
            his0.v(textView, R.drawable.vk_icon_question_12, R.color.vk_orange);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static java.util.List r(int r26, xsna.rlt r27) {
        /*
            r0 = r27
            xsna.klk r1 = r0.c
            com.vk.dto.geo.GeoLocation r2 = r0.a
            if (r2 != 0) goto Lb
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.b
            return r0
        Lb:
            java.lang.String r3 = r2.k
            if (r3 == 0) goto L15
            java.lang.String r3 = xsna.cqm0.b(r3)
            r10 = r3
            goto L16
        L15:
            r10 = 0
        L16:
            xsna.tlt r5 = new xsna.tlt
            double r6 = r2.g
            double r8 = r2.h
            r3 = 1
            if (r10 == 0) goto L28
            int r12 = r10.length()
            if (r12 != 0) goto L26
            goto L28
        L26:
            r12 = 0
            goto L29
        L28:
            r12 = r3
        L29:
            r3 = r3 ^ r12
            boolean r12 = r0.b
            java.util.concurrent.atomic.AtomicReference<android.location.Location> r0 = xsna.oxz.a
            android.content.Context r0 = xsna.e43.a
            if (r0 == 0) goto L33
            goto L34
        L33:
            r0 = 0
        L34:
            boolean r13 = xsna.oxz.a(r0)
            xsna.klk r0 = xsna.klk.c
            boolean r0 = xsna.epx.f(r1, r0)
            if (r0 != 0) goto Lb9
            double r14 = r2.g
            r23 = r5
            double r4 = r2.h
            xsna.chn r2 = xsna.chn.a
            r27 = r12
            r24 = 0
            double r11 = r1.b
            double r0 = r1.a
            r2.getClass()
            xsna.wqo0 r2 = xsna.chn.d
            xsna.qcy<java.lang.Object>[] r25 = xsna.chn.b
            r16 = r25[r24]
            r2.getClass()
            java.lang.Object r16 = r2.get()
            r22 = r16
            float[] r22 = (float[]) r22
            r20 = r0
            r16 = r4
            r18 = r11
            android.location.Location.distanceBetween(r14, r16, r18, r20, r22)
            r0 = r25[r24]
            r2.getClass()
            java.lang.Object r0 = r2.get()
            float[] r0 = (float[]) r0
            r0 = r0[r24]
            android.content.Context r1 = xsna.e43.a
            if (r1 == 0) goto L80
            r4 = r1
            goto L81
        L80:
            r4 = 0
        L81:
            r1 = 1148846080(0x447a0000, float:1000.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 < 0) goto L9f
            float r0 = r0 / r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.text.DecimalFormat r1 = xsna.chn.c
            java.lang.String r0 = r1.format(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 2131955802(0x7f13105a, float:1.9548142E38)
            java.lang.String r0 = r4.getString(r1, r0)
        L9d:
            r4 = r0
            goto Lb0
        L9f:
            int r0 = (int) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 2131955803(0x7f13105b, float:1.9548144E38)
            java.lang.String r0 = r4.getString(r1, r0)
            goto L9d
        Lb0:
            r12 = r27
            r14 = r4
            r5 = r23
        Lb5:
            r15 = r26
            r11 = r3
            goto Lbb
        Lb9:
            r14 = 0
            goto Lb5
        Lbb:
            r5.<init>(r6, r8, r10, r11, r12, r13, r14, r15)
            java.util.List r0 = java.util.Collections.singletonList(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.w65.r(int, xsna.rlt):java.util.List");
    }

    public static int s(CharSequence charSequence, ByteBuffer byteBuffer) {
        CharsetEncoder newEncoder = emb.b.newEncoder();
        if (newEncoder.canEncode(charSequence)) {
            newEncoder.encode(CharBuffer.wrap(charSequence), byteBuffer, true);
            return byteBuffer.position();
        }
        throw new IllegalStateException("Can't encode " + ((Object) charSequence) + " to buffer=" + byteBuffer);
    }

    @Override // xsna.dv90.a
    public Object a(qdg0 qdg0Var) {
        return ((x2o0.d) qdg0Var).getTokenStatus();
    }

    @Override // xsna.abk0
    public boolean b(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        switch (this.b) {
            case 4:
                return "NeverEqualPolicy";
            default:
                return super.toString();
        }
    }
}
