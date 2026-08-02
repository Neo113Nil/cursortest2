package xsna;

import com.vk.im.engine.models.dialogs.Dialog;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RecentAndHintsDialogsGetCmd.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class g9f0 extends FunctionReferenceImpl implements izs<Dialog, Boolean> {
    @Override // xsna.izs
    public final Boolean invoke(Dialog dialog) {
        return Boolean.valueOf(((List) this.receiver).contains(dialog));
    }
}
