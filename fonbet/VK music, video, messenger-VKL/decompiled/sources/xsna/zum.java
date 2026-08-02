package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.impl.posting.viewpresenter.ImPostingConfig;
import com.vkontakte.android.api.ExtendedUserProfile;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.HashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zum implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zum(long j, Object obj, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
        this.e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.e;
        long j = this.c;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                avm avmVar = (avm) obj3;
                PinnedMsg pinnedMsg = (PinnedMsg) obj2;
                SQLiteStatement compileStatement = ((e0w) obj).compileStatement("\n            UPDATE dialogs\n            SET\n                pinned_msg_exists = ?, pinned_msg_cnv_msg_id = ?,\n                pinned_msg_from_type = ?, pinned_msg_from_id = ?, pinned_msg_time = ?,\n                pinned_msg_title = ?, pinned_msg_body = ?, pinned_msg_attaches = ?, pinned_msg_nested = ?,\n                pinned_msg_is_unavailable = ?\n            WHERE id = ?\n            ");
                try {
                    if (pinnedMsg == null) {
                        compileStatement.bindLong(1, 0L);
                        for (int i2 = 2; i2 < 11; i2++) {
                            compileStatement.bindNull(i2);
                        }
                    } else {
                        rdi.i(compileStatement, 1, true);
                        compileStatement.bindLong(2, pinnedMsg.c);
                        compileStatement.bindLong(3, pinnedMsg.d.c.h());
                        compileStatement.bindLong(4, pinnedMsg.d.d);
                        compileStatement.bindLong(5, pinnedMsg.e);
                        compileStatement.bindString(6, pinnedMsg.f);
                        compileStatement.bindString(7, pinnedMsg.g);
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                        compileStatement.bindBlob(8, Serializer.b.f(pinnedMsg.i));
                        compileStatement.bindBlob(9, Serializer.b.f(pinnedMsg.j));
                        rdi.i(compileStatement, 10, pinnedMsg.m);
                    }
                    compileStatement.bindLong(11, j);
                    compileStatement.executeUpdateDelete();
                    compileStatement.close();
                    avmVar.b.b().h(new oqb(j, pinnedMsg, avmVar));
                    return s3q0.a;
                } finally {
                }
            default:
                vz70 a = rfc0.a();
                a.n().a.putParcelable("imPostingDesignConfig", (ImPostingConfig) ((jju0) obj3).d.getValue());
                a.g(new UserId(j), (ExtendedUserProfile) ((ptk) obj).a);
                a.m();
                a.i(PostingCreationEntryPoint.ChannelWriteBarButton);
                a.d((jbs) obj2, 3);
                return s3q0.a;
        }
    }
}
