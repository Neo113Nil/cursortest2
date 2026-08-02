package xsna;

/* compiled from: SplashscreensService.kt */
/* loaded from: classes2.dex */
public interface alk0 {
    default tfx a(int i) {
        tfx tfxVar = new tfx("splashscreens.markAsViewed", new s3j0(3), new t3j0(2));
        tfx.l(tfxVar, "id", i, 0, 0, 12);
        return tfxVar;
    }

    default tfx b() {
        return new tfx("splashscreens.get", new ct(25), new dt(27));
    }
}
