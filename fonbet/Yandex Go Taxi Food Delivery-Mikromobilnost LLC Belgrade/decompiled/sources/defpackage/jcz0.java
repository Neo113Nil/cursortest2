package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.ui.imageviewer.ImageViewerInfo;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public interface jcz0 {
    void A(o4v0 o4v0Var);

    void B(long j, String str);

    void C(Uri uri);

    default void a(long j, String str, String str2, String str3) {
    }

    default void b(ServerMessageRef serverMessageRef) {
    }

    default void c() {
    }

    void d(ImageView imageView, String str, ImageViewerInfo imageViewerInfo, nu10 nu10Var);

    void e(String str);

    void f(long j, String str, String str2);

    void g(LocalMessageRef localMessageRef, j3b j3bVar, y2r y2rVar, nu10 nu10Var);

    void h(String str);

    void i(String str, String str2);

    default void j(String str) {
    }

    void k(LocalMessageRef localMessageRef, j3b j3bVar, y2r y2rVar, nu10 nu10Var);

    void l(LocalMessageRef localMessageRef, j3b j3bVar, y2r y2rVar, nu10 nu10Var, f02 f02Var);

    default void m(String str, int i, boolean z, boolean z2) {
    }

    default void n(String str) {
    }

    void o(String str, String str2, ServerMessageRef serverMessageRef, String str3);

    void p(String str);

    void q(ImageView imageView, String str, ImageViewerInfo imageViewerInfo, ArrayList arrayList, nu10 nu10Var);

    default void r(String str, ServerMessageRef serverMessageRef) {
    }

    default void s(nu10 nu10Var) {
    }

    default void t(ChatRequest chatRequest, Long l, String str, int i, boolean z) {
    }

    void u(String str);

    default void v(ServerMessageRef serverMessageRef) {
    }

    void w(LocalMessageRef localMessageRef);

    void x(nu10 nu10Var, CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, j3b j3bVar, y2r y2rVar, boolean z6, boolean z7);

    void y(String str, String str2, String str3);

    void z(String str, String str2, String str3);
}
