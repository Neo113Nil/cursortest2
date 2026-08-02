package xsna;

import com.vk.im.engine.models.dialogs.FolderType;
import xsna.dxj;

/* compiled from: DialogsFolderCreateMergeTask.kt */
/* loaded from: classes2.dex */
public final class upm extends b920 {
    public final rdm c;

    /* compiled from: DialogsFolderCreateMergeTask.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FolderType.values().length];
            try {
                iArr[FolderType.CHANNELS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public upm(rdm rdmVar) {
        this.c = rdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof upm) && epx.f(this.c, ((upm) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        pdm c = w2wVar.I0().b().c();
        e0w b = c.b.b();
        rdm rdmVar = this.c;
        b.h(new u9(12, c, rdmVar));
        if (a.$EnumSwitchMapping$0[rdmVar.c.ordinal()] == 1) {
            w2wVar.e1(this, new dxj.a(this));
        }
        return s3q0.a;
    }

    public final String toString() {
        return "DialogsFolderCreateMergeTask(folder=" + this.c + ')';
    }
}
