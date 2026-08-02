package org.jsoup.select;

import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.nodes.g;
import xsna.sqm0;

/* loaded from: classes8.dex */
public class Elements extends ArrayList<g> {
    @Override // java.util.ArrayList
    public final Object clone() {
        Elements elements = new Elements(size());
        Iterator<g> it = iterator();
        while (it.hasNext()) {
            elements.add(it.next().clone());
        }
        return elements;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder a = sqm0.a();
        Iterator<g> it = iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (a.length() != 0) {
                a.append("\n");
            }
            a.append(next.u());
        }
        return sqm0.d(a);
    }
}
