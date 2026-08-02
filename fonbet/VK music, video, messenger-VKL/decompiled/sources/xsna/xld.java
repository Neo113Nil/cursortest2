package xsna;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.coremedia.iso.boxes.MetaBox;
import com.vk.clips.upload.edit.api.preview.PreviewThumbs;
import com.vk.core.snackbar.HideReason;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$IntRef;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class xld implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xld(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 3;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                PreviewThumbs previewThumbs = (PreviewThumbs) obj4;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Bitmap bitmap = (Bitmap) obj;
                int i3 = previewThumbs.d;
                int i4 = previewThumbs.b;
                int i5 = i3 * i4;
                int i6 = previewThumbs.f;
                if (i6 == 1) {
                    i4 = bitmap.getWidth();
                }
                int height = i6 == 1 ? bitmap.getHeight() : previewThumbs.c;
                int i7 = previewThumbs.e;
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < i7 && ref$IntRef.element != i6; i10++) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, i8, i9, i4, height);
                    i8 += i4;
                    if (i8 == i5) {
                        i9 += height;
                        i8 = 0;
                    }
                    arrayList.add(createBitmap);
                    ref$IntRef.element++;
                }
                return s3q0.a;
            case 1:
                String str = (String) obj2;
                int intValue = ((Integer) obj4).intValue();
                int intValue2 = ((Integer) obj3).intValue();
                ufx ufxVar = new ufx("superApp.getShowcasePage", new ohl0(i2), new com.vk.movika.sdk.base.model.history.b(29));
                ufx.k(ufxVar, "session_id", intValue, 0, 12);
                ufx.k(ufxVar, SignalingProtocol.KEY_OFFSET, intValue2, 0, 12);
                if (str != null) {
                    ufx.n(ufxVar, MetaBox.TYPE, str, 0, 12);
                }
                return rsg0.T(yfb.x(ufxVar));
            case 2:
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                qyg0 V0 = ((hyg0) obj).V0("INSERT OR REPLACE INTO meta(name, value, storage_name) VALUES(?, ?, ?)");
                try {
                    V0.D3(1, str2);
                    V0.D3(2, str3);
                    V0.D3(3, str4);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 3:
                izs izsVar = (izs) obj3;
                gzs gzsVar = (gzs) obj2;
                onb0 onb0Var = (onb0) obj;
                ((com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.f) obj4).getClass();
                if (onb0Var.b) {
                    izsVar.invoke(onb0Var.a);
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    gzsVar.invoke();
                    s3q0 s3q0Var2 = s3q0.a;
                }
                return s3q0.a;
            default:
                qot0 qot0Var = (qot0) obj4;
                UserId userId = (UserId) obj3;
                View view = (View) obj2;
                HideReason hideReason = (HideReason) obj;
                if (hideReason == HideReason.Swipe || hideReason == HideReason.Manual) {
                    if (userId != null) {
                        fxc0.B().E().g(userId);
                    }
                    qot0Var.o = null;
                }
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                qot0Var.q = null;
                qot0Var.p = false;
                return s3q0.a;
        }
    }
}
