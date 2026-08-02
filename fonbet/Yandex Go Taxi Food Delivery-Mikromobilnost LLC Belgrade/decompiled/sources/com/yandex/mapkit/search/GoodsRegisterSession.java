package com.yandex.mapkit.search;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface GoodsRegisterSession {

    public interface GoodsRegisterListener {
        void onGoodsRegisterError(Error error);

        void onGoodsRegisterResponse(GoodsRegister goodsRegister);
    }

    void cancel();

    void retry(GoodsRegisterListener goodsRegisterListener);
}
