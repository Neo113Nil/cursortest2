package com.google.zxing.qrcode.detector;

import defpackage.d8r;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public final class FinderPatternFinder$EstimatedModuleComparator implements Comparator<d8r>, Serializable {
    @Override // java.util.Comparator
    public final int compare(d8r d8rVar, d8r d8rVar2) {
        return Float.compare(d8rVar.c, d8rVar2.c);
    }
}
