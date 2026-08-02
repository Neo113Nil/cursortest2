package xsna;

import android.content.Context;
import com.vk.media.pipeline.PipelineException;
import com.vk.media.pipeline.model.timeline.Timeline;

/* compiled from: PipelineBuilderImpl.kt */
/* loaded from: classes3.dex */
public final class ipa0 implements hpa0 {
    public final Context a;
    public final xu10 b;
    public final jpa0 c;
    public final f100 d;
    public Timeline e;
    public d80 f;
    public pms0 g;

    public ipa0(Context context, xu10 xu10Var, jpa0 jpa0Var, f100 f100Var) {
        this.a = context;
        this.b = xu10Var;
        this.c = jpa0Var;
        this.d = f100Var;
    }

    @Override // xsna.hpa0
    public final gpa0 build() {
        if (this.e != null) {
            return new ppa0(this);
        }
        throw new PipelineException("Timeline must be specified");
    }

    @Override // xsna.hpa0
    public final hpa0 c(Timeline timeline) {
        this.e = timeline;
        return this;
    }

    @Override // xsna.fyi
    public final Object d(d80 d80Var) {
        this.f = d80Var;
        return this;
    }

    @Override // xsna.hpa0
    public final hpa0 f(int i, String str) {
        xu10 xu10Var = this.b;
        if (xu10Var != null) {
            xu10Var.i(str);
        }
        if (xu10Var != null) {
            xu10Var.f(i);
        }
        return this;
    }

    @Override // xsna.fyi
    public final Object g(apk apkVar) {
        this.g = apkVar;
        return this;
    }
}
