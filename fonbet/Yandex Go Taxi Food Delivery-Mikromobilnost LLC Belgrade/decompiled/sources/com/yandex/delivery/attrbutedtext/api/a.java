package com.yandex.delivery.attrbutedtext.api;

import com.yandex.delivery.attrbutedtext.api.FormattedText;

/* loaded from: classes11.dex */
public interface a {
    String a();

    boolean b();

    FormattedText.VerticalAlignment c();

    default Float d() {
        return null;
    }

    default Integer getHeight() {
        return null;
    }

    default Integer getWidth() {
        return null;
    }
}
