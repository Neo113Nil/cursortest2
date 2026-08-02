package core.divkit.container;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import core.divkit.view.DivViewLayout;
import defpackage.apl;
import defpackage.bpl;
import defpackage.jxi;
import defpackage.omk;
import defpackage.tls;
import defpackage.zmk;
import kotlin.Metadata;

@jxi
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \u00072\u00020\u00012\u00020\u0002:\u0001\bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcore/divkit/container/DivViewContainer;", "Landroid/view/ViewGroup;", "Lbpl;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "apl", "divkit-wrap_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class DivViewContainer extends ViewGroup implements bpl {
    public static final apl Companion = new apl();

    public DivViewContainer(Context context) {
        super(context);
    }

    public static final DivViewContainer wrap(Div2View div2View, ViewGroup.LayoutParams layoutParams) {
        Companion.getClass();
        DivViewLayout divViewLayout = new DivViewLayout(div2View.getContext(), div2View);
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        divViewLayout.setLayoutParams(layoutParams);
        return divViewLayout;
    }

    @Override // defpackage.bpl
    public abstract /* synthetic */ Div2View getDivView();

    @Override // defpackage.bpl
    public abstract /* synthetic */ ViewGroup getLayout();

    public abstract /* synthetic */ int getPlaceholderHeight();

    @Override // defpackage.bpl
    public abstract /* synthetic */ boolean setData(omk omkVar, zmk zmkVar);

    @Override // defpackage.bpl
    public abstract /* synthetic */ void setDataAsync(omk omkVar, zmk zmkVar, tls tlsVar);

    @Override // defpackage.bpl
    public abstract /* synthetic */ void setPlaceholderHeight(int i);

    @Override // defpackage.bpl
    public abstract /* synthetic */ void toContentMode();

    @Override // defpackage.bpl
    public abstract /* synthetic */ void toPlaceholderMode();
}
