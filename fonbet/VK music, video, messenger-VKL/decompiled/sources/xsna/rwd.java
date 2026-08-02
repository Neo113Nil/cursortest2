package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.seek.ClipsSeekBar;
import com.vk.clips.editor.aspectratio.impl.FormatAspectRatio;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.tool.VkToolButton;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.wn2;

/* compiled from: ClipsEditorAspectRatioView.kt */
/* loaded from: classes16.dex */
public final class rwd implements ClipsEditorScreen {
    public final ViewStub b;
    public final wn2 c;
    public final com.vk.clips.editor.base.api.b d;
    public final nwd e;
    public final ClipsEditorScreen.State f = ClipsEditorScreen.State.ASPECT_RATIO;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public int k;
    public qu3 l;
    public final qwd m;

    /* compiled from: ClipsEditorAspectRatioView.kt */
    public static final class a implements ClipsSeekBar.b {
        public a() {
        }

        @Override // com.vk.clips.design.view.seek.ClipsSeekBar.b
        public final void a() {
            rwd.this.e.n();
        }

        @Override // com.vk.clips.design.view.seek.ClipsSeekBar.b
        public final void b() {
            rwd.this.e.p();
        }
    }

    public rwd(ViewStub viewStub, wn2 wn2Var, uy50 uy50Var, nwd nwdVar) {
        this.b = viewStub;
        this.c = wn2Var;
        this.d = uy50Var;
        this.e = nwdVar;
        com.vk.movika.sdk.base.logic.processor.actions.i iVar = new com.vk.movika.sdk.base.logic.processor.actions.i(this, 16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, iVar);
        this.h = msy.a(lazyThreadSafetyMode, new bu1(this, 13));
        this.i = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.h(this, 18));
        this.j = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.model.b(this, 22));
        VkToolButton vkToolButton = (VkToolButton) d().findViewById(R.id.format_back_btn);
        VkButton vkButton = (VkButton) d().findViewById(R.id.format_done);
        RecyclerView recyclerView = (RecyclerView) d().findViewById(R.id.format_list);
        qwd qwdVar = new qwd(this);
        this.m = qwdVar;
        jjc.g(vkToolButton, new tm0(this, 26));
        jjc.g(vkButton, new g60(this, 27));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(qwdVar);
        qwdVar.setItems(a());
        nwdVar.r(this);
        ClipsSeekBar c = c();
        c.setSelectedColor(R.color.vk_white);
        c.setThumbColor(R.color.vk_white);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final List<qu3> a() {
        return (List) this.i.getValue();
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final boolean a0() {
        qu3 qu3Var = this.l;
        if (qu3Var == null) {
            return false;
        }
        int i = this.k;
        FormatAspectRatio formatAspectRatio = qu3Var.a;
        if (i == formatAspectRatio.ordinal()) {
            return false;
        }
        e(formatAspectRatio.ordinal());
        this.e.s(formatAspectRatio);
        return false;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final void b(boolean z, ClipsEditorScreen.a aVar) {
        Object obj;
        Object obj2;
        wn2.a.a(this.c, d(), (View) this.h.getValue(), new wn2.b(z, true), null, 24);
        nwd nwdVar = this.e;
        nwdVar.m();
        d3m.c(c(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        c().setOnSeekBarChangeListener(new aa6(this, 7));
        c().setStateListener(new a());
        Iterator<T> it = a().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            qu3 qu3Var = (qu3) obj2;
            if (qu3Var.a.getWidth() / qu3Var.a.getHeight() == nwdVar.q()) {
                break;
            }
        }
        qu3 qu3Var2 = (qu3) obj2;
        if (qu3Var2 != null) {
            e(qu3Var2.a.ordinal());
        }
        Iterator<T> it2 = a().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((qu3) next).d) {
                obj = next;
                break;
            }
        }
        this.l = (qu3) obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ClipsSeekBar c() {
        return (ClipsSeekBar) this.j.getValue();
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final void close() {
        this.c.d(d(), null);
        this.e.onClosed();
        d3m.e(c(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        c().setOnSeekBarChangeListener(null);
        c().setStateListener(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ViewGroup d() {
        return (ViewGroup) this.g.getValue();
    }

    public final void e(int i) {
        a().get(this.k).d = false;
        int i2 = this.k;
        qu3 qu3Var = a().get(this.k);
        qwd qwdVar = this.m;
        qwdVar.J0(i2, qu3Var);
        this.k = i;
        a().get(this.k).d = true;
        qwdVar.J0(this.k, a().get(this.k));
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final ClipsEditorScreen.State getState() {
        return this.f;
    }
}
