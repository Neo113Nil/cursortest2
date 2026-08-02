package com.yandex.div.core.view2;

import kotlin.Lazy;
import xsna.bpn0;
import xsna.epx;
import xsna.gzs;
import xsna.urd0;

/* compiled from: CompositeLogId.kt */
/* loaded from: classes7.dex */
public final class CompositeLogId {
    private final String actionLogId;
    private final Lazy compositeLogId$delegate = new bpn0(new gzs<String>() { // from class: com.yandex.div.core.view2.CompositeLogId$compositeLogId$2
        {
            super(0);
        }

        @Override // xsna.gzs
        public final String invoke() {
            String formatCompositeLogId;
            formatCompositeLogId = CompositeLogId.this.formatCompositeLogId();
            return formatCompositeLogId;
        }
    });
    private final String dataTag;
    private final String scopeLogId;

    public CompositeLogId(String str, String str2, String str3) {
        this.dataTag = str;
        this.scopeLogId = str2;
        this.actionLogId = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatCompositeLogId() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.dataTag);
        if (this.scopeLogId.length() > 0) {
            str = "#" + this.scopeLogId;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append('#');
        sb.append(this.actionLogId);
        return sb.toString();
    }

    private final String getCompositeLogId() {
        return (String) this.compositeLogId$delegate.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeLogId)) {
            return false;
        }
        CompositeLogId compositeLogId = (CompositeLogId) obj;
        return epx.f(this.dataTag, compositeLogId.dataTag) && epx.f(this.scopeLogId, compositeLogId.scopeLogId) && epx.f(this.actionLogId, compositeLogId.actionLogId);
    }

    public int hashCode() {
        return this.actionLogId.hashCode() + urd0.a(this.dataTag.hashCode() * 31, 31, this.scopeLogId);
    }

    public String toString() {
        return getCompositeLogId();
    }
}
