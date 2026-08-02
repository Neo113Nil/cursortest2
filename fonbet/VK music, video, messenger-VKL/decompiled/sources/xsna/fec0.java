package xsna;

import androidx.room.l;
import com.ironsource.X3;
import com.vk.newsfeed.posting.impl.data.db.PostingDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import xsna.nxn0;

/* compiled from: PostingDatabase_Impl.kt */
/* loaded from: classes4.dex */
public final class fec0 extends androidx.room.l {
    public final /* synthetic */ PostingDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fec0(PostingDatabase_Impl postingDatabase_Impl) {
        super(7, "27f96c2a6eaaf4a2a4bf95692b884b20", "fe049738715e9a781d731734f8832919");
        this.d = postingDatabase_Impl;
    }

    @Override // androidx.room.l
    public final void a(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `posting_draft` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` INTEGER NOT NULL, `text` TEXT NOT NULL, `privacy_settings_type` TEXT NOT NULL, `display_mode` TEXT NOT NULL, `crop_data` TEXT NOT NULL, `coauthors` TEXT, `postpone_publish_date` INTEGER, `poll` TEXT, `place` TEXT, `article` TEXT, `link` TEXT, `music` TEXT, `file` TEXT, `attachments` TEXT NOT NULL, `photo_tags` TEXT, `settings` TEXT, `actionButton` TEXT, `rememberActionButton` INTEGER, `open_for_all_date` INTEGER, `donutTeaserText` TEXT)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        p7i.e(hyg0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '27f96c2a6eaaf4a2a4bf95692b884b20')");
    }

    @Override // androidx.room.l
    public final void b(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `posting_draft`");
    }

    @Override // androidx.room.l
    public final void d(hyg0 hyg0Var) {
        this.d.r(hyg0Var);
    }

    @Override // androidx.room.l
    public final void f(hyg0 hyg0Var) {
        urk.a(hyg0Var);
    }

    @Override // androidx.room.l
    public final l.a g(hyg0 hyg0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap.put("user_id", new nxn0.a(0, "user_id", "INTEGER", null, true, 1));
        linkedHashMap.put("text", new nxn0.a(0, "text", "TEXT", null, true, 1));
        linkedHashMap.put("privacy_settings_type", new nxn0.a(0, "privacy_settings_type", "TEXT", null, true, 1));
        linkedHashMap.put("display_mode", new nxn0.a(0, "display_mode", "TEXT", null, true, 1));
        linkedHashMap.put("crop_data", new nxn0.a(0, "crop_data", "TEXT", null, true, 1));
        linkedHashMap.put("coauthors", new nxn0.a(0, "coauthors", "TEXT", null, false, 1));
        linkedHashMap.put("postpone_publish_date", new nxn0.a(0, "postpone_publish_date", "INTEGER", null, false, 1));
        linkedHashMap.put("poll", new nxn0.a(0, "poll", "TEXT", null, false, 1));
        linkedHashMap.put("place", new nxn0.a(0, "place", "TEXT", null, false, 1));
        linkedHashMap.put("article", new nxn0.a(0, "article", "TEXT", null, false, 1));
        linkedHashMap.put("link", new nxn0.a(0, "link", "TEXT", null, false, 1));
        linkedHashMap.put("music", new nxn0.a(0, "music", "TEXT", null, false, 1));
        linkedHashMap.put(X3.i.b, new nxn0.a(0, X3.i.b, "TEXT", null, false, 1));
        linkedHashMap.put("attachments", new nxn0.a(0, "attachments", "TEXT", null, true, 1));
        linkedHashMap.put("photo_tags", new nxn0.a(0, "photo_tags", "TEXT", null, false, 1));
        linkedHashMap.put("settings", new nxn0.a(0, "settings", "TEXT", null, false, 1));
        linkedHashMap.put("actionButton", new nxn0.a(0, "actionButton", "TEXT", null, false, 1));
        linkedHashMap.put("rememberActionButton", new nxn0.a(0, "rememberActionButton", "INTEGER", null, false, 1));
        linkedHashMap.put("open_for_all_date", new nxn0.a(0, "open_for_all_date", "INTEGER", null, false, 1));
        nxn0 nxn0Var = new nxn0("posting_draft", linkedHashMap, b690.a(linkedHashMap, "donutTeaserText", new nxn0.a(0, "donutTeaserText", "TEXT", null, false, 1)), new LinkedHashSet());
        nxn0 a = nxn0.b.a(hyg0Var, "posting_draft");
        return !nxn0Var.equals(a) ? new l.a(false, t3j0.a("posting_draft(com.vk.newsfeed.posting.impl.data.draft.PostingDraft).\n Expected:\n", nxn0Var, "\n Found:\n", a)) : new l.a(true, null);
    }

    @Override // androidx.room.l
    public final void c() {
    }

    @Override // androidx.room.l
    public final void e() {
    }
}
