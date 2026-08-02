package xsna;

import com.vk.instantjobs.InstantJob;
import xsna.u6x;

/* compiled from: DownloadReactionAssetsJob.kt */
/* loaded from: classes.dex */
public final class o9o extends u4w {
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;

    /* compiled from: DownloadReactionAssetsJob.kt */
    public static final class a implements s7x<o9o> {
        @Override // xsna.s7x
        public final o9o a(ny90 ny90Var) {
            int c = ny90Var.c("key_id");
            String f = ny90Var.f("key_static_url");
            String f2 = ny90Var.f("key_animation_url");
            return new o9o(c, ny90Var.g("key_version") ? ny90Var.c("key_version") : 1, ny90Var.f("key_big_animation_url"), f2, f);
        }

        @Override // xsna.s7x
        public final void b(o9o o9oVar, ny90 ny90Var) {
            o9o o9oVar2 = o9oVar;
            ny90Var.l("key_id", o9oVar2.c);
            ny90Var.o("key_static_url", o9oVar2.f);
            ny90Var.o("key_animation_url", o9oVar2.e);
            ny90Var.o("key_big_animation_url", o9oVar2.d);
            ny90Var.l("key_version", o9oVar2.g);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "DownloadReactionAssetsJob";
        }
    }

    public o9o(int i, int i2, String str, String str2, String str3) {
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = i2;
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        ((b0f0) w2wVar.getConfig().a.p.invoke()).g(this.c, this.f, this.e, this.d);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return "im-reactions-assets-download-job";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "DownloadReactionAssetsJob";
    }
}
