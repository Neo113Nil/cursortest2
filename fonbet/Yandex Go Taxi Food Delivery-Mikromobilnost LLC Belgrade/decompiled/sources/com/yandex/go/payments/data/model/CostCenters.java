package com.yandex.go.payments.data.model;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.gsq0;
import defpackage.hxe;
import defpackage.i3y;
import defpackage.k4o;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/data/model/CostCenters;", "", "Companion", "CostCenterInfo", "InputFormat", "$serializer", "com/yandex/go/payments/data/model/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CostCenters {
    public static final l Companion = new l();
    public static final i3y[] d;
    public final boolean a;
    public final InputFormat b;
    public final List c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/data/model/CostCenters$InputFormat;", "", "Companion", "com/yandex/go/payments/data/model/n", BaseDatabaseHelper.TYPE_TEXT, "MIXED", "SELECT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class InputFormat {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ InputFormat[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final n Companion;
        public static final InputFormat MIXED;
        public static final InputFormat SELECT;
        public static final InputFormat TEXT;

        static {
            InputFormat inputFormat = new InputFormat(BaseDatabaseHelper.TYPE_TEXT, 0);
            TEXT = inputFormat;
            InputFormat inputFormat2 = new InputFormat("MIXED", 1);
            MIXED = inputFormat2;
            InputFormat inputFormat3 = new InputFormat("SELECT", 2);
            SELECT = inputFormat3;
            InputFormat[] inputFormatArr = {inputFormat, inputFormat2, inputFormat3};
            $VALUES = inputFormatArr;
            $ENTRIES = kotlin.enums.a.a(inputFormatArr);
            Companion = new n();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hxe(3));
        }

        public static InputFormat valueOf(String str) {
            return (InputFormat) Enum.valueOf(InputFormat.class, str);
        }

        public static InputFormat[] values() {
            return (InputFormat[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new hxe(1)), kotlin.a.b(lazyThreadSafetyMode, new hxe(2))};
    }

    public /* synthetic */ CostCenters(int i, boolean z, InputFormat inputFormat, List list) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = InputFormat.TEXT;
        } else {
            this.b = inputFormat;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/CostCenters$CostCenterInfo;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CostCenterInfo {
        public static final m Companion = new m();
        public final String a;

        public /* synthetic */ CostCenterInfo(int i, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
        }

        public CostCenterInfo() {
            this.a = null;
        }
    }

    public CostCenters() {
        InputFormat inputFormat = InputFormat.TEXT;
        this.a = false;
        this.b = inputFormat;
        this.c = EmptyList.a;
    }
}
