package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block.ComparisonView;
import ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block.OptionType;

/* loaded from: classes5.dex */
public final /* synthetic */ class pvc implements lvc, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComparisonView b;

    public /* synthetic */ pvc(ComparisonView comparisonView, int i) {
        this.a = i;
        this.b = comparisonView;
    }

    @Override // defpackage.lvc
    public final void a(OptionType optionType) {
        int i = this.a;
        ComparisonView comparisonView = this.b;
        switch (i) {
            case 0:
                comparisonView.setCheckedType(optionType);
                break;
            default:
                comparisonView.setCheckedType(optionType);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof lvc) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof lvc) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
        }
        return new FunctionReferenceImpl(1, this.b, ComparisonView.class, "setCheckedType", "setCheckedType(Lru/yandex/taxi/altpins/confirmation_screen/modal/comparison_block/OptionType;)V", 0);
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
