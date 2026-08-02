package xsna;

import com.vk.im.engine.models.dialogs.FolderType;

/* compiled from: FolderCounterSettingsInteractorImpl.kt */
/* loaded from: classes18.dex */
public final class dyr implements eyr, byr {
    public final gzs<a1w> a;
    public final b25 b;

    /* compiled from: FolderCounterSettingsInteractorImpl.kt */
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

    public dyr(b25 b25Var, gzs gzsVar) {
        this.a = gzsVar;
        this.b = b25Var;
    }

    @Override // xsna.eyr
    public final boolean a(FolderType folderType) {
        if (a.$EnumSwitchMapping$0[folderType.ordinal()] == 1) {
            return this.b.i().Q.d;
        }
        throw new UnsupportedOperationException("Invalid folderTypeItem " + folderType);
    }

    @Override // xsna.byr
    public final io.reactivex.rxjava3.core.a b(FolderType folderType, boolean z) {
        return new io.reactivex.rxjava3.internal.operators.completable.p(c(folderType, z));
    }

    @Override // xsna.eyr
    public final io.reactivex.rxjava3.internal.operators.single.h c(FolderType folderType, boolean z) {
        if (a.$EnumSwitchMapping$0[folderType.ordinal()] == 1) {
            io.reactivex.rxjava3.internal.operators.single.c C = this.a.invoke().C(this, new pyi0(FolderType.CHANNELS, z));
            asu0.a.getClass();
            return new io.reactivex.rxjava3.internal.operators.single.h(C.q(asu0.r()), new e6x0(new cyr(this, z), 1));
        }
        throw new UnsupportedOperationException("Invalid folderType " + folderType);
    }

    @Override // xsna.eyr
    public final boolean d(FolderType folderType) {
        return folderType == FolderType.CHANNELS;
    }
}
