package xsna;

import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.EmptyList;

/* compiled from: DialogsSettingsExt.kt */
/* loaded from: classes2.dex */
public final class wvm {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Collection<DialogsCounters.Type> a(Dialog dialog, w2w w2wVar) {
        boolean z;
        com.vk.im.engine.models.dialogs.b c = sn.c(w2wVar).c(dialog.Zb().b);
        if (c == null) {
            return EmptyList.b;
        }
        if (!dialog.Qb()) {
            Boolean bool = c.n;
            if (!(bool != null ? bool.booleanValue() : c.m)) {
                z = false;
                ArrayList arrayList = new ArrayList();
                if (!dialog.pc()) {
                    arrayList.add(DialogsCounters.Type.ARCHIVE_TOTAL);
                    if (!dialog.lc().isEmpty()) {
                        arrayList.add(DialogsCounters.Type.ARCHIVE_MENTIONS);
                    }
                    if (z) {
                        arrayList.add(DialogsCounters.Type.ARCHIVE_UNREAD);
                        if (dialog.Ac(w2wVar.f1())) {
                            arrayList.add(DialogsCounters.Type.ARCHIVE_UNREAD_UNMUTED);
                            return arrayList;
                        }
                    }
                } else if (z) {
                    arrayList.add(DialogsCounters.Type.UNREAD);
                    if (dialog.Ac(w2wVar.f1())) {
                        arrayList.add(DialogsCounters.Type.UNREAD_UNMUTED);
                    }
                }
                return arrayList;
            }
        }
        z = true;
        ArrayList arrayList2 = new ArrayList();
        if (!dialog.pc()) {
        }
        return arrayList2;
    }
}
