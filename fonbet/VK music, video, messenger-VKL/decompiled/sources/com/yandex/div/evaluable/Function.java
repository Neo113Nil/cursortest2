package com.yandex.div.evaluable;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.DateTime;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.e43;
import xsna.izs;
import xsna.j5g;
import xsna.wzs;
import xsna.zcl;

/* compiled from: Function.kt */
/* loaded from: classes7.dex */
public abstract class Function {
    public static final Companion Companion = new Companion(null);
    public static final Function STUB = new Function() { // from class: com.yandex.div.evaluable.Function$Companion$STUB$1
        private final String name = "stub";
        private final List<FunctionArgument> declaredArgs = EmptyList.b;
        private final EvaluableType resultType = EvaluableType.BOOLEAN;
        private final boolean isPure = true;

        @Override // com.yandex.div.evaluable.Function
        /* renamed from: evaluate-ex6DHhM */
        public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
            return Boolean.TRUE;
        }

        @Override // com.yandex.div.evaluable.Function
        public List<FunctionArgument> getDeclaredArgs() {
            return this.declaredArgs;
        }

        @Override // com.yandex.div.evaluable.Function
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.evaluable.Function
        public EvaluableType getResultType() {
            return this.resultType;
        }

        @Override // com.yandex.div.evaluable.Function
        public boolean isPure() {
            return this.isPure;
        }
    };

    /* compiled from: Function.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: Function.kt */
    public static abstract class MatchResult {

        /* compiled from: Function.kt */
        public static final class ArgCountMismatch extends MatchResult {
            private final int expected;

            public ArgCountMismatch(int i) {
                super(null);
                this.expected = i;
            }

            public final int getExpected() {
                return this.expected;
            }
        }

        /* compiled from: Function.kt */
        public static final class ArgTypeMismatch extends MatchResult {
            private final EvaluableType actual;
            private final EvaluableType expected;

            public ArgTypeMismatch(EvaluableType evaluableType, EvaluableType evaluableType2) {
                super(null);
                this.expected = evaluableType;
                this.actual = evaluableType2;
            }

            public final EvaluableType getActual() {
                return this.actual;
            }

            public final EvaluableType getExpected() {
                return this.expected;
            }
        }

        /* compiled from: Function.kt */
        public static final class Ok extends MatchResult {
            public static final Ok INSTANCE = new Ok();

            private Ok() {
                super(null);
            }
        }

        public /* synthetic */ MatchResult(zcl zclVar) {
            this();
        }

        private MatchResult() {
        }
    }

    /* compiled from: Function.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EvaluableType.values().length];
            try {
                iArr[EvaluableType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canCastTo(EvaluableType evaluableType, EvaluableType evaluableType2) {
        return evaluableType == EvaluableType.INTEGER && WhenMappings.$EnumSwitchMapping$0[evaluableType2.ordinal()] == 1;
    }

    private final MatchResult matchesArguments(List<? extends EvaluableType> list, wzs<? super EvaluableType, ? super EvaluableType, Boolean> wzsVar) {
        int size = getDeclaredArgs().size();
        int size2 = getHasVarArg$div_evaluable() ? Integer.MAX_VALUE : getDeclaredArgs().size();
        if (list.size() < size || list.size() > size2) {
            return new MatchResult.ArgCountMismatch(size);
        }
        int size3 = list.size();
        for (int i = 0; i < size3; i++) {
            List<FunctionArgument> declaredArgs = getDeclaredArgs();
            int h = e43.h(getDeclaredArgs());
            if (i <= h) {
                h = i;
            }
            EvaluableType type = declaredArgs.get(h).getType();
            if (!wzsVar.invoke(list.get(i), type).booleanValue()) {
                return new MatchResult.ArgTypeMismatch(type, list.get(i));
            }
        }
        return MatchResult.Ok.INSTANCE;
    }

    /* renamed from: evaluate-ex6DHhM */
    public abstract Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list);

    public abstract List<FunctionArgument> getDeclaredArgs();

    public final boolean getHasVarArg$div_evaluable() {
        FunctionArgument functionArgument = (FunctionArgument) j5g.k0(getDeclaredArgs());
        if (functionArgument != null) {
            return functionArgument.isVariadic();
        }
        return false;
    }

    public abstract String getName();

    public abstract EvaluableType getResultType();

    /* renamed from: invoke-ex6DHhM, reason: not valid java name */
    public final Object m143invokeex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        EvaluableType evaluableType;
        EvaluableType evaluableType2;
        Object mo114evaluateex6DHhM = mo114evaluateex6DHhM(evaluationContext, evaluable, list);
        EvaluableType.Companion companion = EvaluableType.Companion;
        boolean z = mo114evaluateex6DHhM instanceof Long;
        if (z) {
            evaluableType = EvaluableType.INTEGER;
        } else if (mo114evaluateex6DHhM instanceof Double) {
            evaluableType = EvaluableType.NUMBER;
        } else if (mo114evaluateex6DHhM instanceof Boolean) {
            evaluableType = EvaluableType.BOOLEAN;
        } else if (mo114evaluateex6DHhM instanceof String) {
            evaluableType = EvaluableType.STRING;
        } else if (mo114evaluateex6DHhM instanceof DateTime) {
            evaluableType = EvaluableType.DATETIME;
        } else if (mo114evaluateex6DHhM instanceof Color) {
            evaluableType = EvaluableType.COLOR;
        } else if (mo114evaluateex6DHhM instanceof Url) {
            evaluableType = EvaluableType.URL;
        } else if (mo114evaluateex6DHhM instanceof JSONObject) {
            evaluableType = EvaluableType.DICT;
        } else {
            if (!(mo114evaluateex6DHhM instanceof JSONArray)) {
                if (mo114evaluateex6DHhM == null) {
                    throw new EvaluableException("Unable to find type for null", null, 2, null);
                }
                throw new EvaluableException("Unable to find type for ".concat(mo114evaluateex6DHhM.getClass().getName()), null, 2, null);
            }
            evaluableType = EvaluableType.ARRAY;
        }
        if (evaluableType == getResultType()) {
            return mo114evaluateex6DHhM;
        }
        StringBuilder sb = new StringBuilder("Function ");
        sb.append(this);
        sb.append(" returned ");
        if (z) {
            evaluableType2 = EvaluableType.INTEGER;
        } else if (mo114evaluateex6DHhM instanceof Double) {
            evaluableType2 = EvaluableType.NUMBER;
        } else if (mo114evaluateex6DHhM instanceof Boolean) {
            evaluableType2 = EvaluableType.BOOLEAN;
        } else if (mo114evaluateex6DHhM instanceof String) {
            evaluableType2 = EvaluableType.STRING;
        } else if (mo114evaluateex6DHhM instanceof DateTime) {
            evaluableType2 = EvaluableType.DATETIME;
        } else if (mo114evaluateex6DHhM instanceof Color) {
            evaluableType2 = EvaluableType.COLOR;
        } else if (mo114evaluateex6DHhM instanceof Url) {
            evaluableType2 = EvaluableType.URL;
        } else if (mo114evaluateex6DHhM instanceof JSONObject) {
            evaluableType2 = EvaluableType.DICT;
        } else {
            if (!(mo114evaluateex6DHhM instanceof JSONArray)) {
                if (mo114evaluateex6DHhM == null) {
                    throw new EvaluableException("Unable to find type for null", null, 2, null);
                }
                throw new EvaluableException("Unable to find type for ".concat(mo114evaluateex6DHhM.getClass().getName()), null, 2, null);
            }
            evaluableType2 = EvaluableType.ARRAY;
        }
        sb.append(evaluableType2);
        sb.append(", but ");
        sb.append(getResultType());
        sb.append(" was expected.");
        throw new EvaluableException(sb.toString(), null, 2, null);
    }

    public abstract boolean isPure();

    public final MatchResult matchesArguments$div_evaluable(List<? extends EvaluableType> list) {
        return matchesArguments(list, new wzs<EvaluableType, EvaluableType, Boolean>() { // from class: com.yandex.div.evaluable.Function$matchesArguments$1
            @Override // xsna.wzs
            public final Boolean invoke(EvaluableType evaluableType, EvaluableType evaluableType2) {
                return Boolean.valueOf(evaluableType == evaluableType2);
            }
        });
    }

    public final MatchResult matchesArgumentsWithCast$div_evaluable(List<? extends EvaluableType> list) {
        return matchesArguments(list, new wzs<EvaluableType, EvaluableType, Boolean>() { // from class: com.yandex.div.evaluable.Function$matchesArgumentsWithCast$1
            {
                super(2);
            }

            @Override // xsna.wzs
            public final Boolean invoke(EvaluableType evaluableType, EvaluableType evaluableType2) {
                boolean z;
                boolean canCastTo;
                if (evaluableType != evaluableType2) {
                    canCastTo = Function.this.canCastTo(evaluableType, evaluableType2);
                    if (!canCastTo) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            }
        });
    }

    public String toString() {
        return j5g.g0(getDeclaredArgs(), null, getName() + '(', ")", 0, new izs<FunctionArgument, CharSequence>() { // from class: com.yandex.div.evaluable.Function$toString$1
            @Override // xsna.izs
            public final CharSequence invoke(FunctionArgument functionArgument) {
                if (!functionArgument.isVariadic()) {
                    return functionArgument.getType().toString();
                }
                return "vararg " + functionArgument.getType();
            }
        }, 25);
    }
}
