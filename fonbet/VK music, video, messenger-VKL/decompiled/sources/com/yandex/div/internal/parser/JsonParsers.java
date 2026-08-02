package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import io.reactivex.rxjava3.internal.operators.observable.q1;
import java.util.List;
import xsna.dn;
import xsna.ir;
import xsna.izs;
import xsna.s6x;

/* loaded from: classes7.dex */
public class JsonParsers {

    @NonNull
    private static final ValueValidator<?> ALWAYS_VALID = new dn(20);

    @NonNull
    private static final ValueValidator<String> ALWAYS_VALID_STRING = new q1(27);

    @NonNull
    private static final ListValidator<?> ALWAYS_VALID_LIST = new ir(23);

    @NonNull
    private static final izs<?, ?> AS_IS = new s6x(2);

    @NonNull
    public static <T> ValueValidator<T> alwaysValid() {
        return (ValueValidator<T>) ALWAYS_VALID;
    }

    @NonNull
    public static <T> izs<T, T> doNotConvert() {
        return (izs<T, T>) AS_IS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$1(String str) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$2(List list) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$3(Object obj) {
        return obj;
    }
}
