package defpackage;

import com.yandex.plus.core.graphql.type.ARG_CHECKING_PREDICATE_TYPE;
import com.yandex.plus.core.graphql.type.COMPARISON_PREDICATE_TYPE;

/* loaded from: classes2.dex */
public abstract class n1 implements b70 {
    public static ARG_CHECKING_PREDICATE_TYPE c(xdx xdxVar) {
        ARG_CHECKING_PREDICATE_TYPE arg_checking_predicate_type;
        String nextString = xdxVar.nextString();
        ARG_CHECKING_PREDICATE_TYPE.Companion.getClass();
        ARG_CHECKING_PREDICATE_TYPE[] values = ARG_CHECKING_PREDICATE_TYPE.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                arg_checking_predicate_type = null;
                break;
            }
            arg_checking_predicate_type = values[i];
            if (jl40.l(arg_checking_predicate_type.getRawValue(), nextString)) {
                break;
            }
            i++;
        }
        return arg_checking_predicate_type == null ? ARG_CHECKING_PREDICATE_TYPE.UNKNOWN__ : arg_checking_predicate_type;
    }

    public static COMPARISON_PREDICATE_TYPE d(xdx xdxVar) {
        COMPARISON_PREDICATE_TYPE comparison_predicate_type;
        String nextString = xdxVar.nextString();
        COMPARISON_PREDICATE_TYPE.Companion.getClass();
        COMPARISON_PREDICATE_TYPE[] values = COMPARISON_PREDICATE_TYPE.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                comparison_predicate_type = null;
                break;
            }
            comparison_predicate_type = values[i];
            if (jl40.l(comparison_predicate_type.getRawValue(), nextString)) {
                break;
            }
            i++;
        }
        return comparison_predicate_type == null ? COMPARISON_PREDICATE_TYPE.UNKNOWN__ : comparison_predicate_type;
    }

    public static void e(bfx bfxVar, ARG_CHECKING_PREDICATE_TYPE arg_checking_predicate_type) {
        bfxVar.r0(arg_checking_predicate_type.getRawValue());
    }

    public static void f(bfx bfxVar, COMPARISON_PREDICATE_TYPE comparison_predicate_type) {
        bfxVar.r0(comparison_predicate_type.getRawValue());
    }
}
