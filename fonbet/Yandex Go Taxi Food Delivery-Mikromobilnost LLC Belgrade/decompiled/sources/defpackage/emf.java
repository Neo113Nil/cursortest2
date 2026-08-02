package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lemf;", "Ll050;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface emf extends l050 {
    void close();

    void enableConfirmButton(boolean z);

    void placeCursorAtEnd();

    void setInputState(kmf kmfVar);

    void setPreviousValue(String str);

    void showDecimalDigitsCount(int i);

    void showInputPriceSign(int i, String str, String str2);
}
