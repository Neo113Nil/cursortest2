package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import com.vk.auth.api.models.AuthResult;
import com.vk.core.fragments.FragmentEntry;
import com.vk.libvideo.tooltips.VideoTooltip;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.NetworkStateReceiver;
import com.vkontakte.android.R;
import java.util.Objects;
import kotlin.collections.builders.ListBuilder;
import xsna.e3m;
import xsna.r6v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class zwp0 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zwp0(AuthResult authResult, boolean z, FragmentEntry fragmentEntry, FragmentEntry fragmentEntry2) {
        this.d = authResult;
        this.c = z;
        this.e = fragmentEntry;
        this.f = fragmentEntry2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                AuthResult authResult = (AuthResult) this.d;
                boolean z = this.c;
                FragmentEntry fragmentEntry = (FragmentEntry) this.e;
                FragmentEntry fragmentEntry2 = (FragmentEntry) this.f;
                ww50 ww50Var = (ww50) obj;
                if (authResult != null && authResult.o.e) {
                    if (SakFeatures.Type.GET_USER_INFO_CUT_OFF_FROM_AUTH.h()) {
                        i0q0.f(new b990(ww50Var, 24));
                    }
                    Intent intent = new Intent(ww50Var.b, (Class<?>) MainActivity.class);
                    intent.addFlags(67108864);
                    intent.addFlags(32768);
                    intent.addFlags(268435456);
                    ww50Var.b.startActivity(intent);
                    c63 c63Var = c63.a;
                    c63.a(new exp0());
                } else if (authResult != null || (NetworkStateReceiver.a().b && (!z || fragmentEntry != null))) {
                    i0q0.f(new a2c(ww50Var, fragmentEntry, fragmentEntry2, 2));
                }
                break;
            default:
                final VideoTooltip videoTooltip = (VideoTooltip) this.d;
                final VideoTooltip.b bVar = (VideoTooltip.b) this.e;
                final boolean z2 = this.c;
                final VideoTooltip.a aVar = (VideoTooltip.a) this.f;
                r6v.a aVar2 = (r6v.a) obj;
                iri0 iri0Var = new iri0(videoTooltip, aVar);
                videoTooltip.getClass();
                if (z2) {
                    aVar2.e();
                }
                Integer num = bVar.b;
                if (num != null) {
                    aVar2.g(num.intValue());
                }
                r6v.a h = aVar2.b(new DialogInterface.OnShowListener(bVar, z2, aVar) { // from class: xsna.xkt0
                    public final /* synthetic */ VideoTooltip.b c;
                    public final /* synthetic */ boolean d;

                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        Context context;
                        VideoTooltip videoTooltip2 = VideoTooltip.this;
                        View view = videoTooltip2.a;
                        boolean z3 = this.c.e;
                        ListBuilder e = e43.e();
                        if (z3) {
                            e.add(new io.reactivex.rxjava3.internal.operators.completable.e(new f0j0(view, 8)));
                        }
                        e.add(new io.reactivex.rxjava3.internal.operators.completable.e(new dnz(view, 27)));
                        ListBuilder g = e.g();
                        Objects.requireNonNull(g, "sources is null");
                        videoTooltip2.b.b(new io.reactivex.rxjava3.internal.operators.completable.a(null, g).o(io.reactivex.rxjava3.android.schedulers.a.b()).g(new bum(dialogInterface, 3)).subscribe());
                        androidx.appcompat.app.d dVar = dialogInterface instanceof androidx.appcompat.app.d ? (androidx.appcompat.app.d) dialogInterface : null;
                        if (dVar == null) {
                            return;
                        }
                        boolean z4 = this.d;
                        if (z4) {
                            dhr0 dhr0Var = dhr0.a;
                            Context context2 = dVar.getContext();
                            dhr0Var.getClass();
                            context = dhr0.t(context2);
                        } else {
                            context = dVar.getContext();
                        }
                        e3m.a aVar3 = e3m.a;
                        int color = context.getColor(R.color.vk_clear);
                        Window window = dVar.getWindow();
                        if (window != null) {
                            p90.a(window, color, !z4);
                        }
                    }
                }).i(new cnw(aVar, 10)).d(0.75f).h(new ykt0(iri0Var, 0));
                if (bVar.c) {
                    h.m();
                    h.d(1.0f);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ zwp0(o7j0 o7j0Var, VideoTooltip videoTooltip, VideoTooltip.b bVar, boolean z, VideoTooltip.a aVar) {
        this.d = videoTooltip;
        this.e = bVar;
        this.c = z;
        this.f = aVar;
    }
}
