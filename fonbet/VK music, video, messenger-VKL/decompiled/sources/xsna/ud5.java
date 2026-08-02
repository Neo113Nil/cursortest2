package xsna;

import android.widget.ImageView;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.node.LayoutNode;
import com.vk.catalog2.common.ui.mvp.holder.video.AuthorsCatalogRootVh;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vkontakte.android.api.ExtendedUserProfile;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.q630;
import xsna.ttq0;

/* compiled from: AuthorsCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class ud5 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ud5(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        u470 u470Var;
        switch (this.b) {
            case 0:
                AuthorsCatalogRootVh authorsCatalogRootVh = (AuthorsCatalogRootVh) this.receiver;
                authorsCatalogRootVh.getClass();
                authorsCatalogRootVh.i8(vyh0.a);
                break;
            case 1:
                tvr tvrVar = (tvr) this.receiver;
                qh50<dxr> qh50Var = tvrVar.c;
                qh50<lvr> qh50Var2 = tvrVar.d;
                gwr gwrVar = tvrVar.a;
                dxr b = gwrVar.b();
                if (b == null) {
                    Object[] objArr = qh50Var2.b;
                    long[] jArr = qh50Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((j & 255) < 128) {
                                        ((lvr) objArr[(i << 3) + i3]).D(FocusStateImpl.Inactive);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                }
                            }
                            if (i != length) {
                                i++;
                            }
                        }
                    }
                } else if (b.o) {
                    if (qh50Var.a(b)) {
                        b.o2();
                    }
                    FocusStateImpl k0 = b.k0();
                    if (!b.b.o) {
                        uzw.b("visitAncestors called on an unattached node");
                    }
                    q630.c cVar = b.b;
                    LayoutNode f = itl.f(b);
                    int i4 = 0;
                    while (f != null) {
                        if ((f.G.f.e & 5120) != 0) {
                            while (cVar != null) {
                                int i5 = cVar.d;
                                if ((i5 & 5120) != 0) {
                                    if ((i5 & 1024) != 0) {
                                        i4++;
                                    }
                                    if ((cVar instanceof lvr) && qh50Var2.a(cVar)) {
                                        if (i4 <= 1) {
                                            ((lvr) cVar).D(k0);
                                        } else {
                                            ((lvr) cVar).D(FocusStateImpl.ActiveParent);
                                        }
                                        qh50Var2.m(cVar);
                                    }
                                }
                                cVar = cVar.f;
                            }
                        }
                        f = f.I();
                        cVar = (f == null || (u470Var = f.G) == null) ? null : u470Var.e;
                    }
                    Object[] objArr2 = qh50Var2.b;
                    long[] jArr2 = qh50Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j2 = jArr2[i6];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j2 & 255) < 128) {
                                        ((lvr) objArr2[(i6 << 3) + i8]).D(FocusStateImpl.Inactive);
                                    }
                                    j2 >>= 8;
                                }
                                if (i7 != 8) {
                                }
                            }
                            if (i6 != length2) {
                                i6++;
                            }
                        }
                    }
                }
                if (gwrVar.b() == null || gwrVar.c.k0() == FocusStateImpl.Inactive) {
                    gwrVar.A();
                }
                qh50Var.f();
                qh50Var2.f();
                tvrVar.e = false;
                break;
            case 2:
                l0m0 l0m0Var = (l0m0) this.receiver;
                int i9 = l0m0.n;
                l0m0Var.c();
                ImageView imageView = l0m0Var.i;
                imageView.setScaleX(0.01f);
                imageView.setScaleY(0.01f);
                imageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L);
                break;
            case 3:
                ttq0 ttq0Var = (ttq0) this.receiver;
                ttq0.a aVar = ttq0.t;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) ((zak0) ttq0Var.r).getValue();
                if (extendedUserProfile != null) {
                    ttq0Var.t6(extendedUserProfile);
                }
                break;
            case 4:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SMS_LIBVERIFY_STARTED, null, null, null, null, null, null, 254);
                break;
            case 5:
                hds0 hds0Var = (hds0) this.receiver;
                fkn0 fkn0Var = hds0Var.g;
                if (fkn0Var != null) {
                    fkn0Var.i();
                }
                kfp0<zis0> kfp0Var = hds0Var.h;
                if (kfp0Var != null) {
                    kfp0Var.d();
                }
                zis0 zis0Var = hds0Var.i;
                if (zis0Var != null) {
                    zis0Var.c();
                }
                b0u b0uVar = hds0Var.f;
                if (b0uVar != null) {
                    b0uVar.a();
                }
                break;
            default:
                ((com.vk.core.compose.component.datetime.g) this.receiver).e(true);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud5(Object obj, int i) {
        super(0, obj, AuthorsCatalogRootVh.class, "onVoiceRecognitionStarted", "onVoiceRecognitionStarted()V", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(0, obj, ttq0.class, "onScheduledGiftClick", "onScheduledGiftClick()V", 0);
                break;
            case 4:
                super(0, obj, com.vk.registration.funnels.b.class, "onLibverifySmsStarted", "onLibverifySmsStarted()V", 0);
                break;
            case 5:
                super(0, obj, hds0.class, "internalRelease", "internalRelease()V", 0);
                break;
            default:
                break;
        }
    }
}
