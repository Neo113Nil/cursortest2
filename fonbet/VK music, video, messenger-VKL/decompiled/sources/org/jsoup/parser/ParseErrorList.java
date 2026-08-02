package org.jsoup.parser;

import java.util.ArrayList;
import xsna.j0u0;

/* loaded from: classes8.dex */
public class ParseErrorList extends ArrayList<j0u0> {
    private final int initialCapacity;
    private final int maxSize;

    public ParseErrorList() {
        super(0);
        this.initialCapacity = 0;
        this.maxSize = 0;
    }

    public final boolean i() {
        return size() < this.maxSize;
    }

    public final int j() {
        return this.maxSize;
    }
}
