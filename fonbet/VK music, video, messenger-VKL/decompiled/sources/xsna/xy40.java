package xsna;

import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.j11;
import xsna.kel0;
import xsna.ov50;
import xsna.ydl0;

/* compiled from: MusicPlayerStickyBannerAd.kt */
/* loaded from: classes3.dex */
public final class xy40 implements ov50.b {
    public final /* synthetic */ yy40 a;

    public xy40(yy40 yy40Var) {
        this.a = yy40Var;
    }

    @Override // xsna.ov50.b
    public final void a() {
        ydl0.a aVar = this.a.b;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // xsna.ov50.b
    public final void b() {
        ydl0.a aVar = this.a.b;
        if (aVar != null) {
            aVar.onClick();
        }
    }

    @Override // xsna.ov50.b
    public final void c(iaz0 iaz0Var) {
        int i = iaz0Var.a;
        String str = iaz0Var.b;
        if (i == 1403) {
            str = "forbidden";
        } else if (i == 1404) {
            str = "not found";
        } else if (i == 1500) {
            str = "internal server error";
        } else if (i == 6000) {
            str = "internal error";
        } else if (i == 4001) {
            str = "reloading not allowed";
        } else if (i == 4002) {
            str = "not loaded yet";
        } else if (i == 5000) {
            str = "undefined mediation error";
        } else if (i != 5001) {
            switch (i) {
                case 1000:
                    str = "undefined network error";
                    break;
                case 1001:
                    str = "invalid url";
                    break;
                case 1002:
                    str = "network connection failed";
                    break;
                case 1003:
                    str = "request timeout";
                    break;
                default:
                    switch (i) {
                        case 2000:
                            str = "undefined parse error";
                            break;
                        case 2001:
                            str = "empty response";
                            break;
                        case 2002:
                            str = "invalid json";
                            break;
                        case 2003:
                            str = "invalid xml";
                            break;
                        case 2004:
                            str = "invalid type";
                            break;
                        case 2005:
                            str = "required field missed";
                            break;
                        default:
                            switch (i) {
                                case IronSourceError.ERROR_CAPPING_VALIDATION_FAILED /* 3000 */:
                                    str = "undefined data error";
                                    break;
                                case 3001:
                                    str = "banner has no image";
                                    break;
                                case 3002:
                                    str = "banner has no html source";
                                    break;
                                case BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE:
                                    str = "no banners";
                                    break;
                                case 3004:
                                    str = "invalid banner type";
                                    break;
                            }
                    }
            }
        } else {
            str = "ad not loaded from mediation network";
        }
        ydl0.a aVar = this.a.b;
        if (aVar != null) {
            aVar.b(new j11.b(i, str));
        }
    }

    @Override // xsna.ov50.b
    public final void d(nv50 nv50Var) {
        String str = nv50Var.g;
        if (str == null) {
            str = "";
        }
        ydl0.b.AbstractC4094b.a aVar = new ydl0.b.AbstractC4094b.a(new kel0.a(str, nv50Var.i, nv50Var.j, nv50Var.n, nv50Var.h, nv50Var.o, nv50Var.l, epx.f(nv50Var.a, X3.i.U), nv50Var.c, nv50Var.d));
        yy40 yy40Var = this.a;
        yy40Var.d = aVar;
        ydl0.a aVar2 = yy40Var.b;
        if (aVar2 != null) {
            aVar2.c(yy40Var, aVar);
        }
    }
}
