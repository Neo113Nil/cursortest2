package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.conversations.BotKeyboard;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.HashMap;
import java.util.List;
import xsna.phw;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class eei implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ eei(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List<InfoBar.Button> list;
        r1 = null;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                mnj mnjVar = (mnj) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(mnjVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1455401925, intValue, -1, "androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt.lambda$-1455401925.<anonymous> (ContextMenuUi.kt:305)");
                    }
                    ja8.a(hr80.m(txj0.h(txj0.f(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, woj.l, 1, q630.a.a), 1.0f), woj.k), mnjVar.c, androidx.compose.ui.graphics.e.a), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue2 = ((Integer) obj3).intValue();
                BotKeyboard botKeyboard = ((com.vk.im.engine.models.dialogs.b) obj2).D;
                rdi.j(sQLiteStatement, intValue2, botKeyboard != null ? Boolean.valueOf(botKeyboard.c) : null);
                return s3q0.a;
            case 2:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                InfoBar infoBar = ((com.vk.im.engine.models.dialogs.b) obj2).w;
                if (infoBar != null && (list = infoBar.j) != null) {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    bArr = Serializer.b.f(list);
                }
                rdi.h(sQLiteStatement2, intValue3, bArr);
                return s3q0.a;
            default:
                lg90 lg90Var = (lg90) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                aVar2.K(-1088285371);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1088285371, intValue4, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastPlaybackQueueItem.Content.<anonymous> (PodcastPlaybackQueueItem.kt:65)");
                }
                phw a = phw.a.a(lg90Var, null, null, null, null, aVar2, 196616 | (intValue4 & 14), 30);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return a;
        }
    }
}
