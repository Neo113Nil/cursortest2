package defpackage;

import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;

/* loaded from: classes9.dex */
public interface bpl {
    Div2View getDivView();

    ViewGroup getLayout();

    boolean setData(omk omkVar, zmk zmkVar);

    void setDataAsync(omk omkVar, zmk zmkVar, tls tlsVar);

    void setPlaceholderHeight(int i);

    void toContentMode();

    void toPlaceholderMode();
}
