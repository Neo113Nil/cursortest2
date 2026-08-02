package com.yandex.div.core;

import xsna.qqn;

/* loaded from: classes7.dex */
public interface DivViewConfig {
    public static final DivViewConfig DEFAULT = new qqn();

    default int getLogCardScrollSignificantThreshold() {
        return 0;
    }
}
