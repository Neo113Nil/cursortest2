package com.ybsdk.screens.upgrade.domain.entities;

import defpackage.k4o;
import defpackage.xds0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0080\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/screens/upgrade/domain/entities/SimpleIdFormFieldEntity;", "", "", "inputName", "", "order", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "Ljava/lang/String;", "getInputName", "()Ljava/lang/String;", CA20Status.STATUS_USER_I, "getOrder", "()I", "Companion", "xds0", "LAST_NAME", "FIRST_NAME", "MIDDLE_NAME", "BIRTHDAY", "PASSPORT_NUMBER", "INN_OR_SNILS", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SimpleIdFormFieldEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SimpleIdFormFieldEntity[] $VALUES;
    public static final xds0 Companion;
    private static final List<SimpleIdFormFieldEntity> sorted;
    private final String inputName;
    private final int order;
    public static final SimpleIdFormFieldEntity LAST_NAME = new SimpleIdFormFieldEntity("LAST_NAME", 0, "last_name", 0);
    public static final SimpleIdFormFieldEntity FIRST_NAME = new SimpleIdFormFieldEntity("FIRST_NAME", 1, "first_name", 1);
    public static final SimpleIdFormFieldEntity MIDDLE_NAME = new SimpleIdFormFieldEntity("MIDDLE_NAME", 2, "middle_name", 2);
    public static final SimpleIdFormFieldEntity BIRTHDAY = new SimpleIdFormFieldEntity("BIRTHDAY", 3, "birthday", 3);
    public static final SimpleIdFormFieldEntity PASSPORT_NUMBER = new SimpleIdFormFieldEntity("PASSPORT_NUMBER", 4, "passport_number", 4);
    public static final SimpleIdFormFieldEntity INN_OR_SNILS = new SimpleIdFormFieldEntity("INN_OR_SNILS", 5, "inn_or_snils", 5);

    private static final /* synthetic */ SimpleIdFormFieldEntity[] $values() {
        return new SimpleIdFormFieldEntity[]{LAST_NAME, FIRST_NAME, MIDDLE_NAME, BIRTHDAY, PASSPORT_NUMBER, INN_OR_SNILS};
    }

    static {
        SimpleIdFormFieldEntity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new xds0();
        Object[] values = values();
        Comparator comparator = new Comparator() { // from class: com.ybsdk.screens.upgrade.domain.entities.SimpleIdFormFieldEntity.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.valueOf(((SimpleIdFormFieldEntity) obj).getOrder()).compareTo(Integer.valueOf(((SimpleIdFormFieldEntity) obj2).getOrder()));
            }
        };
        if (values.length != 0) {
            values = Arrays.copyOf(values, values.length);
            if (values.length > 1) {
                Arrays.sort(values, comparator);
            }
        }
        sorted = Arrays.asList(values);
    }

    private SimpleIdFormFieldEntity(String str, int i, String str2, int i2) {
        this.inputName = str2;
        this.order = i2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SimpleIdFormFieldEntity valueOf(String str) {
        return (SimpleIdFormFieldEntity) Enum.valueOf(SimpleIdFormFieldEntity.class, str);
    }

    public static SimpleIdFormFieldEntity[] values() {
        return (SimpleIdFormFieldEntity[]) $VALUES.clone();
    }

    public final String getInputName() {
        return this.inputName;
    }

    public final int getOrder() {
        return this.order;
    }
}
