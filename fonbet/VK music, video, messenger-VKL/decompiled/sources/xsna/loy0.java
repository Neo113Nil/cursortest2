package xsna;

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public interface loy0 {

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    /* loaded from: classes14.dex */
    public interface a {
        void a(float f);

        void a(float f, float f2);

        void a(String str);

        void b(float f);

        void c();

        void f();

        void g();

        void h();

        void j();

        void k();

        void p();
    }

    void A(dvy0 dvy0Var);

    void B(Context context, Uri uri);

    void a();

    boolean b();

    boolean c();

    void d();

    void destroy();

    void e();

    void f();

    boolean g();

    float getDuration();

    long getPosition();

    Uri getUri();

    float getVolume();

    void h();

    boolean isPlaying();

    void pause();

    void resume();

    void seekTo(long j);

    void setVolume(float f);

    void stop();

    void x(a aVar);
}
