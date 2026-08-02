package xsna;

import android.content.Context;
import android.graphics.Canvas;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.log.L;
import com.vk.subscription.api.SubscribeStatus;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.kzw0;
import xsna.pmw0;
import xsna.wex0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qvm0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qvm0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, xsna.c9m0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean d;
        switch (this.b) {
            case 0:
                ClipsAuthor clipsAuthor = (ClipsAuthor) this.c;
                uvm0 uvm0Var = (uvm0) this.d;
                kym0 kym0Var = (kym0) obj;
                if (fkq0.d(clipsAuthor.b.b)) {
                    int i = clipsAuthor.f;
                    d = i == 3 || !(i == 0 || i == 2);
                } else {
                    d = ehd.d(clipsAuthor);
                }
                SubscribeStatus.a aVar = SubscribeStatus.Companion;
                SubscribeStatus subscribeStatus = kym0Var.a;
                aVar.getClass();
                boolean c = SubscribeStatus.a.c(subscribeStatus);
                if (c == d) {
                    return s3q0.a;
                }
                uvm0Var.d(clipsAuthor, Boolean.valueOf(c));
                return s3q0.a;
            case 1:
                return ((qgp0) this.c).b.t(String.valueOf(((UserId) this.d).b), (List) obj);
            case 2:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.d;
                ref$ObjectRef.element = new c9m0(5, null, (f3u0) obj);
                dw20 dw20Var = (dw20) ref$ObjectRef2.element;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 3:
                return VKAvatarView.U0((VKAvatarView) this.c, (Canvas) this.d);
            case 4:
                pmw0.a.b bVar = (pmw0.a.b) this.c;
                pmw0 pmw0Var = (pmw0) this.d;
                StringBuilder sb = new StringBuilder("Request to load chat info for ");
                sb.append(bVar.a);
                sb.append(':');
                SessionRoomId sessionRoomId = bVar.b;
                sb.append(sessionRoomId);
                sb.append(" failed");
                L.e("VoipChatInfoLoader", sb.toString());
                pmw0Var.h.onNext(pmw0.a.C3519a.a);
                pmw0Var.c.invoke(bVar.a, sessionRoomId);
                return s3q0.a;
            case 5:
                u6x0 u6x0Var = (u6x0) obj;
                return new kzw0.c.b((CharSequence) this.c, (set0) this.d, u6x0Var.b, u6x0Var.c);
            default:
                final zgn0 zgn0Var = (zgn0) this.c;
                Context context = (Context) this.d;
                byte[] bArr = (byte[]) obj;
                HashMap<String, byte[]> hashMap = wex0.b;
                String str = zgn0Var.a;
                hashMap.put(str, bArr);
                final LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
                w800<i700> e = q700.e(new ByteArrayInputStream(bArr), (String) j5g.i0(drm0.c0(str, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6)));
                e.a(new uex0());
                e.b(new r800() { // from class: xsna.vex0
                    @Override // xsna.r800
                    public final void onResult(Object obj2) {
                        LottieAnimationView lottieAnimationView2 = LottieAnimationView.this;
                        try {
                            lottieAnimationView2.setComposition((i700) obj2);
                        } catch (Exception e2) {
                            L.i(e2);
                        }
                        lottieAnimationView2.setScaleType(zgn0Var.b);
                        lottieAnimationView2.setRepeatCount(-1);
                    }
                });
                return new wex0.a(lottieAnimationView);
        }
    }

    public /* synthetic */ qvm0(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, sp spVar) {
        this.b = 2;
        this.c = ref$ObjectRef;
        this.d = ref$ObjectRef2;
    }
}
