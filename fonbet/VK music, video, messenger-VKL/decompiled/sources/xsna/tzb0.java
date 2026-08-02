package xsna;

import java.util.Stack;

/* compiled from: PositionsStack.kt */
/* loaded from: classes.dex */
public final class tzb0 {
    public final Stack<Integer> a = new Stack<>();

    public final boolean a(int i) {
        Integer peek;
        Stack<Integer> stack = this.a;
        return stack.isEmpty() || (peek = stack.peek()) == null || peek.intValue() != i;
    }
}
