package xsna;

/* compiled from: MusicClipsCatalogResponseTransformer.kt */
/* loaded from: classes3.dex */
public final class of40 implements jda {
    public final fz8 b;

    public of40(fz8 fz8Var) {
        this.b = fz8Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v4 com.vk.catalog2.common.dto.ui.UIBlockCatalog, still in use, count: 2, list:
          (r11v4 com.vk.catalog2.common.dto.ui.UIBlockCatalog) from 0x02c9: MOVE (r48v0 com.vk.catalog2.common.dto.ui.UIBlockCatalog) = (r11v4 com.vk.catalog2.common.dto.ui.UIBlockCatalog) (LINE:714)
          (r11v4 com.vk.catalog2.common.dto.ui.UIBlockCatalog) from 0x00bd: PHI (r11v6 com.vk.catalog2.common.dto.ui.UIBlockCatalog) = (r11v4 com.vk.catalog2.common.dto.ui.UIBlockCatalog), (r11v18 com.vk.catalog2.common.dto.ui.UIBlockCatalog) binds: [B:24:0x00b3, B:35:0x0297] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // xsna.jda
    public final java.util.List<com.vk.catalog2.common.dto.api.ui.UIBlock> b(java.lang.Object r99, com.vk.catalog2.common.dto.api.CatalogExtendedData r100, boolean r101, boolean r102) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.of40.b(java.lang.Object, com.vk.catalog2.common.dto.api.CatalogExtendedData, boolean, boolean):java.util.List");
    }
}
