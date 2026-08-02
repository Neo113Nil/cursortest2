package com.yandex.go.where_you_are.impl.presentation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.az41;
import defpackage.bdc;
import defpackage.bo31;
import defpackage.cma1;
import defpackage.d9h0;
import defpackage.nlh0;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tls;
import defpackage.u601;
import defpackage.xng0;
import defpackage.zy41;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.bubble.BubbleComponent;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/where_you_are/impl/presentation/WhereYouAreBubble;", "Lru/yandex/taxi/design/bubble/BubbleComponent;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lkz41;", "Lzy11;", "editClick", "Lkotlin/Function0;", "skipClick", "sizeChanged", "<init>", "(Landroid/content/Context;Ltls;Lsls;Lsls;)V", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Laz41;", ClidProvider.STATE, "render", "(Laz41;)V", "Ltls;", "Lsls;", "Lzy41;", "binding", "Lzy41;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WhereYouAreBubble extends BubbleComponent {
    private final zy41 binding;
    private final tls editClick;
    private final sls sizeChanged;

    public WhereYouAreBubble(Context context, tls tlsVar, sls slsVar, sls slsVar2) {
        super(context, null, 0, 6, null);
        this.editClick = tlsVar;
        this.sizeChanged = slsVar2;
        View inflate = LayoutInflater.from(context).inflate(nlh0.where_you_are_bubble_content, (ViewGroup) this, false);
        addView(inflate);
        int i = d9h0.no_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = d9h0.where_you_are_bubble_text;
            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
            if (listItemComponent != null) {
                i = d9h0.yes_button;
                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent2 != null) {
                    this.binding = new zy41((LinearLayout) inflate, buttonComponent, listItemComponent, buttonComponent2);
                    buttonComponent2.setDebounceClickListener(new u601(10, slsVar));
                    getDecorator().b(new bdc(xng0.bgMain));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$0(WhereYouAreBubble whereYouAreBubble, az41 az41Var) {
        whereYouAreBubble.editClick.invoke(az41Var.d);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        this.sizeChanged.invoke();
    }

    public final void render(az41 state) {
        this.binding.c.setTitle(state.c);
        this.binding.b.setText(state.b);
        this.binding.d.setText(state.a);
        this.binding.b.setDebounceClickListener(new bo31(6, this, state));
    }
}
