package com.yandex.div.core.util;

import com.yandex.div.core.expression.local.LocalFunction;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div2.DivEvaluableType;
import com.yandex.div2.t4;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.c5g;
import xsna.rln;

/* compiled from: FunctionMapper.kt */
/* loaded from: classes7.dex */
public final class FunctionMapperKt {

    /* compiled from: FunctionMapper.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivEvaluableType.values().length];
            try {
                iArr[DivEvaluableType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivEvaluableType.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivEvaluableType.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivEvaluableType.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivEvaluableType.DATETIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DivEvaluableType.COLOR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DivEvaluableType.URL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DivEvaluableType.DICT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DivEvaluableType.ARRAY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final EvaluableType toEvaluableType(DivEvaluableType divEvaluableType) {
        switch (WhenMappings.$EnumSwitchMapping$0[divEvaluableType.ordinal()]) {
            case 1:
                return EvaluableType.STRING;
            case 2:
                return EvaluableType.INTEGER;
            case 3:
                return EvaluableType.NUMBER;
            case 4:
                return EvaluableType.BOOLEAN;
            case 5:
                return EvaluableType.DATETIME;
            case 6:
                return EvaluableType.COLOR;
            case 7:
                return EvaluableType.URL;
            case 8:
                return EvaluableType.DICT;
            case 9:
                return EvaluableType.ARRAY;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final List<LocalFunction> toLocalFunctions(List<t4> list) {
        List<t4> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (t4 t4Var : list2) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (rln rlnVar : t4Var.a) {
                arrayList2.add(rlnVar.a);
                arrayList3.add(new FunctionArgument(toEvaluableType(rlnVar.b), false, 2, null));
            }
            arrayList.add(new LocalFunction(t4Var.c, arrayList3, toEvaluableType(t4Var.d), arrayList2, t4Var.b));
        }
        return arrayList;
    }
}
