package defpackage;

import android.os.Bundle;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.android.TransparencyMode;

/* loaded from: classes4.dex */
public final class dsr {
    public final String a;
    public String b = "main";
    public String c = "/";
    public boolean d = false;
    public RenderMode e = RenderMode.surface;
    public TransparencyMode f = TransparencyMode.transparent;
    public boolean g = true;
    public boolean h = false;
    public boolean i = false;

    public dsr(String str) {
        this.a = str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("cached_engine_group_id", this.a);
        bundle.putString("dart_entrypoint", this.b);
        bundle.putString("initial_route", this.c);
        bundle.putBoolean("handle_deeplinking", this.d);
        RenderMode renderMode = this.e;
        if (renderMode == null) {
            renderMode = RenderMode.surface;
        }
        bundle.putString("flutterview_render_mode", renderMode.name());
        TransparencyMode transparencyMode = this.f;
        if (transparencyMode == null) {
            transparencyMode = TransparencyMode.transparent;
        }
        bundle.putString("flutterview_transparency_mode", transparencyMode.name());
        bundle.putBoolean("should_attach_engine_to_activity", this.g);
        bundle.putBoolean("destroy_engine_with_fragment", true);
        bundle.putBoolean("should_automatically_handle_on_back_pressed", this.h);
        bundle.putBoolean("should_delay_first_android_view_draw", this.i);
        return bundle;
    }
}
