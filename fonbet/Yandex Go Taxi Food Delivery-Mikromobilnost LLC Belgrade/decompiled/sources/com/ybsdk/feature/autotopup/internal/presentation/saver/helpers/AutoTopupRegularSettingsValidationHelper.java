package com.ybsdk.feature.autotopup.internal.presentation.saver.helpers;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* loaded from: classes3.dex */
public final class AutoTopupRegularSettingsValidationHelper {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/saver/helpers/AutoTopupRegularSettingsValidationHelper$Errors;", "", "<init>", "(Ljava/lang/String;I)V", "SOURCE_NOT_SELECTED", "DATE_MISSING_FIRST", "DATE_MISSING_SECOND", "AMOUNT_WRONG_FIRST", "AMOUNT_WRONG_SECOND", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Errors {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Errors[] $VALUES;
        public static final Errors SOURCE_NOT_SELECTED = new Errors("SOURCE_NOT_SELECTED", 0);
        public static final Errors DATE_MISSING_FIRST = new Errors("DATE_MISSING_FIRST", 1);
        public static final Errors DATE_MISSING_SECOND = new Errors("DATE_MISSING_SECOND", 2);
        public static final Errors AMOUNT_WRONG_FIRST = new Errors("AMOUNT_WRONG_FIRST", 3);
        public static final Errors AMOUNT_WRONG_SECOND = new Errors("AMOUNT_WRONG_SECOND", 4);

        private static final /* synthetic */ Errors[] $values() {
            return new Errors[]{SOURCE_NOT_SELECTED, DATE_MISSING_FIRST, DATE_MISSING_SECOND, AMOUNT_WRONG_FIRST, AMOUNT_WRONG_SECOND};
        }

        static {
            Errors[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private Errors(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Errors valueOf(String str) {
            return (Errors) Enum.valueOf(Errors.class, str);
        }

        public static Errors[] values() {
            return (Errors[]) $VALUES.clone();
        }
    }
}
