package com.yandex.div.core.view2.divs;

import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.v3;
import com.yandex.div2.zd;
import xsna.apn;

/* compiled from: DivSightExtensions.kt */
/* loaded from: classes7.dex */
public final class DivSightExtensionsKt {
    public static final Expression<Long> getDuration(apn apnVar) {
        if (apnVar instanceof zd) {
            return ((zd) apnVar).j;
        }
        if (apnVar instanceof v3) {
            return ((v3) apnVar).a;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Trying to get duration field for unsupported DivSightAction class");
        }
        return Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);
    }
}
