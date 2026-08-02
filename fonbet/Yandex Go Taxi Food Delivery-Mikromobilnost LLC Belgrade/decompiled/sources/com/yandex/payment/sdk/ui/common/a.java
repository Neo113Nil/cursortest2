package com.yandex.payment.sdk.ui.common;

import com.yandex.payment.sdk.model.data.ResultScreenClosing;
import com.yandex.payment.sdk.ui.common.ResultFragment;
import defpackage.wwg;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class a {
    public static ResultFragment a(int i, Integer num, ResultScreenClosing resultScreenClosing) {
        ResultFragment resultFragment = new ResultFragment();
        resultFragment.setArguments(wwg.g(new Pair("ARG_RESULT", ResultFragment.RESULT.FAILURE), new Pair("ARG_TEXT", Integer.valueOf(i)), new Pair("ARG_SUBTITLE", num), new Pair("ARG_CLOSING", resultScreenClosing)));
        return resultFragment;
    }

    public static ResultFragment b(int i, ResultScreenClosing resultScreenClosing) {
        ResultFragment resultFragment = new ResultFragment();
        resultFragment.setArguments(wwg.g(new Pair("ARG_RESULT", ResultFragment.RESULT.SUCCESS), new Pair("ARG_TEXT", Integer.valueOf(i)), new Pair("ARG_IS_LOGGED_IN", Boolean.TRUE), new Pair("ARG_CLOSING", resultScreenClosing)));
        return resultFragment;
    }
}
