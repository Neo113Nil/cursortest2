package xsna;

import com.vk.im.engine.models.dialogs.FolderType;
import xsna.dxj;

/* compiled from: DialogsFolderDeleteMergeTask.kt */
/* loaded from: classes2.dex */
public final class wpm extends b920 {
    public final int c;

    /* compiled from: DialogsFolderDeleteMergeTask.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FolderType.values().length];
            try {
                iArr[FolderType.CHANNELS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FolderType.MANAGED_GROUPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wpm(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wpm) && this.c == ((wpm) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        pdm c = w2wVar.I0().b().c();
        int i = this.c;
        rdm e = c.e(i);
        if (e != null) {
            int i2 = a.$EnumSwitchMapping$0[e.c.ordinal()];
            if (i2 == 1 || i2 == 2) {
                w2wVar.e1(w2wVar, new dxj.b(w2wVar));
            }
        }
        w2wVar.I0().b().c().a(i);
        return s3q0.a;
    }

    public final String toString() {
        return vu5.b(new StringBuilder("DialogsFolderDeleteMergeTask(id="), this.c, ')');
    }
}
