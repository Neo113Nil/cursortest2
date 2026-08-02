package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.vk.dialogslist.impl.DialogsFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vkontakte.android.attachments.DocumentAttachment;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Triple;

/* compiled from: CornerTreatment.java */
/* loaded from: classes.dex */
public class wuj implements pok0 {
    public static final wuj a = new wuj();

    public static r74 b(NewsEntry newsEntry, NewsEntry newsEntry2, DocumentAttachment documentAttachment, int i) {
        r74 r74Var = new r74(i, documentAttachment, newsEntry, newsEntry2);
        r74Var.h = (ol60) j5g.a0(new fdi().N(0, new Triple(newsEntry, documentAttachment, Integer.valueOf(i))));
        return r74Var;
    }

    public static r74 c(NewsEntry newsEntry, NewsEntry newsEntry2, DocumentAttachment documentAttachment, int i) {
        r74 r74Var = new r74(i, documentAttachment, newsEntry, newsEntry2);
        r74Var.h = (ol60) j5g.a0(new zjq().q(0, new Pair(documentAttachment, Integer.valueOf(i)), null));
        return r74Var;
    }

    @Override // xsna.pok0
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i5 = i2 - intValue;
                if (i2 + i5 <= stackTraceElementArr.length) {
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (stackTraceElementArr[intValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        }
                    }
                    int intValue2 = i2 - num.intValue();
                    if (i4 < 10) {
                        System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, intValue2);
                        i3 += intValue2;
                        i4++;
                    }
                    i = (intValue2 - 1) + i2;
                    hashMap.put(stackTraceElement, Integer.valueOf(i2));
                    i2 = i + 1;
                }
            }
            stackTraceElementArr2[i3] = stackTraceElementArr[i2];
            i3++;
            i4 = 1;
            i = i2;
            hashMap.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        return i3 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    public void d(Exception exc) {
        L.e(exc);
    }

    public void e(String str) {
        L.e(str);
    }

    public void f(@NonNull com.google.android.material.shape.d dVar, float f, float f2) {
        throw null;
    }

    public DialogsFragment g(Bundle bundle) {
        DialogsFragment dialogsFragment = new DialogsFragment();
        dialogsFragment.setArguments(bundle);
        return dialogsFragment;
    }

    public void h(String str, Throwable th) {
        if (sv1.u(th)) {
            L.j(th, str);
        } else {
            com.vk.metrics.eventtracking.b.a.a(th);
        }
    }
}
