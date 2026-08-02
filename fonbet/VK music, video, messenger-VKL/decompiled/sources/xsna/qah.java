package xsna;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.collections.EmptyList;

/* compiled from: CommunityNameHistoryAdapter.kt */
/* loaded from: classes5.dex */
public final class qah extends sxm implements vic {
    public final SimpleDateFormat i = new SimpleDateFormat("d MMMM yyyy", Locale.getDefault());

    public qah() {
        x0(uah.class, new mmf(this, 7));
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        setItems(EmptyList.b);
    }
}
