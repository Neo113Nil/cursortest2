package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.vk.newsfeed.utils.NewsDebuggerPoint;
import xsna.b0g;

/* compiled from: NewsfeedStoriesBlockPlugin.kt */
/* loaded from: classes4.dex */
public final class g070 implements obs {
    public final /* synthetic */ d070 b;

    public g070(d070 d070Var) {
        this.b = d070Var;
    }

    @Override // xsna.obs
    public final void onPause() {
        this.b.u = false;
        ts60 ts60Var = this.b.c;
        NewsDebuggerPoint newsDebuggerPoint = NewsDebuggerPoint.ChangeList;
        ts60Var.T();
        this.b.a().onPause();
    }

    @Override // xsna.obs
    public final void onResume() {
        this.b.u = true;
        b0g b0gVar = b0g.a;
        final d070 d070Var = this.b;
        b0g.a(new b0g.a() { // from class: xsna.f070
            @Override // xsna.b0g.a
            public final void a() {
                d070 d070Var2 = d070.this;
                if (d070Var2.u) {
                    ts60 ts60Var = d070Var2.c;
                    NewsDebuggerPoint newsDebuggerPoint = NewsDebuggerPoint.ChangeList;
                    ts60Var.T();
                    d070Var2.a().onResume();
                }
            }
        });
        xif0 xif0Var = this.b.w;
        if (xif0Var != null) {
            xif0Var.a();
        }
    }

    @Override // xsna.obs
    public final void b() {
    }

    @Override // xsna.obs
    public final void c() {
    }

    @Override // xsna.obs
    public final void onDestroy() {
    }

    @Override // xsna.obs
    public final void onDestroyView() {
    }

    @Override // xsna.obs
    public final void onStop() {
    }

    @Override // xsna.obs
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // xsna.obs
    public final void onCreate(Bundle bundle) {
    }

    @Override // xsna.obs
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
