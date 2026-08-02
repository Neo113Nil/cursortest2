package com.yandex.div.core.view2.state;

import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.StateConflictException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.j3;
import java.util.List;

/* compiled from: DivStateSwitcher.kt */
/* loaded from: classes7.dex */
public interface DivStateSwitcher {
    void switchStates(j3.b bVar, List<DivStatePath> list, ExpressionResolver expressionResolver) throws StateConflictException;
}
