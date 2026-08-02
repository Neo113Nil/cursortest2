package xsna;

import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import com.vk.newsfeed.api.data.NewsComment;

/* compiled from: CommentsListContract.kt */
/* loaded from: classes3.dex */
public interface afg extends cc6, c.l<vqt>, bd70<Object>, b3g0, f420, ud60 {
    void B7(m3g0 m3g0Var);

    void Fm(iag iagVar);

    void I8(iag iagVar);

    void Q1(String str);

    jag Ra(NewsComment newsComment, udg udgVar);

    void lg();

    void onCreate(Bundle bundle);

    @Override // xsna.b3g0, xsna.tdg
    UserId p();

    default void wg(iag iagVar, boolean z) {
    }
}
