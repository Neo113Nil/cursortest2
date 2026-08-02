package xsna;

import androidx.room.l;
import com.vk.story.viewer.stat.data.cache.StoryStatisticsDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import xsna.nxn0;

/* compiled from: StoryStatisticsDatabase_Impl.kt */
/* loaded from: classes6.dex */
public final class mem0 extends androidx.room.l {
    public final /* synthetic */ StoryStatisticsDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mem0(StoryStatisticsDatabase_Impl storyStatisticsDatabase_Impl) {
        super(3, "d0301b8ff3c4ab57ebb47db8fb8f85ee", "f961a9e993e05cb4c18732bcdb42d513");
        this.d = storyStatisticsDatabase_Impl;
    }

    @Override // androidx.room.l
    public final void a(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `story_statistics_info` (`owner_id` INTEGER NOT NULL, `story_id` INTEGER NOT NULL, `storyStatisticsInfo` TEXT NOT NULL, PRIMARY KEY(`owner_id`, `story_id`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `story_statistics_viewer` (`ordinal_id` INTEGER NOT NULL, `owner_id` INTEGER NOT NULL, `story_id` INTEGER NOT NULL, `user_id` INTEGER NOT NULL, `storyStatisticsViewer` TEXT NOT NULL, PRIMARY KEY(`owner_id`, `story_id`, `user_id`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `story_statistics_viewers_meta` (`owner_id` INTEGER NOT NULL, `story_id` INTEGER NOT NULL, `viewsCount` INTEGER NOT NULL, `answersCount` INTEGER NOT NULL, `reactionsCount` INTEGER NOT NULL, `new_reactions` INTEGER NOT NULL, PRIMARY KEY(`owner_id`, `story_id`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `story_statistics_excluded_users` (`owner_id` INTEGER NOT NULL, `excludedUsers` TEXT NOT NULL, PRIMARY KEY(`owner_id`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `story_statistics_question` (`owner_id` INTEGER NOT NULL, `story_id` INTEGER NOT NULL, `question_id` INTEGER NOT NULL, `date` INTEGER NOT NULL, `storyStatisticsQuestion` TEXT NOT NULL, PRIMARY KEY(`owner_id`, `story_id`, `question_id`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `story_statistics_questions_meta` (`owner_id` INTEGER NOT NULL, `story_id` INTEGER NOT NULL, `totalQuestionsCount` INTEGER NOT NULL, PRIMARY KEY(`owner_id`, `story_id`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        p7i.e(hyg0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd0301b8ff3c4ab57ebb47db8fb8f85ee')");
    }

    @Override // androidx.room.l
    public final void b(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `story_statistics_info`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `story_statistics_viewer`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `story_statistics_viewers_meta`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `story_statistics_excluded_users`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `story_statistics_question`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `story_statistics_questions_meta`");
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
        linkedHashMap.put("owner_id", new nxn0.a(1, "owner_id", "INTEGER", null, true, 1));
        linkedHashMap.put("story_id", new nxn0.a(2, "story_id", "INTEGER", null, true, 1));
        nxn0 nxn0Var = new nxn0("story_statistics_info", linkedHashMap, b690.a(linkedHashMap, "storyStatisticsInfo", new nxn0.a(0, "storyStatisticsInfo", "TEXT", null, true, 1)), new LinkedHashSet());
        nxn0 a = nxn0.b.a(hyg0Var, "story_statistics_info");
        if (!nxn0Var.equals(a)) {
            return new l.a(false, t3j0.a("story_statistics_info(com.vk.story.viewer.stat.data.cache.info.StoryStatisticsInfoEntity).\n Expected:\n", nxn0Var, "\n Found:\n", a));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("ordinal_id", new nxn0.a(0, "ordinal_id", "INTEGER", null, true, 1));
        linkedHashMap2.put("owner_id", new nxn0.a(1, "owner_id", "INTEGER", null, true, 1));
        linkedHashMap2.put("story_id", new nxn0.a(2, "story_id", "INTEGER", null, true, 1));
        linkedHashMap2.put("user_id", new nxn0.a(3, "user_id", "INTEGER", null, true, 1));
        nxn0 nxn0Var2 = new nxn0("story_statistics_viewer", linkedHashMap2, b690.a(linkedHashMap2, "storyStatisticsViewer", new nxn0.a(0, "storyStatisticsViewer", "TEXT", null, true, 1)), new LinkedHashSet());
        nxn0 a2 = nxn0.b.a(hyg0Var, "story_statistics_viewer");
        if (!nxn0Var2.equals(a2)) {
            return new l.a(false, t3j0.a("story_statistics_viewer(com.vk.story.viewer.stat.data.cache.viewers.viewer.StoryStatisticsViewerEntity).\n Expected:\n", nxn0Var2, "\n Found:\n", a2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("owner_id", new nxn0.a(1, "owner_id", "INTEGER", null, true, 1));
        linkedHashMap3.put("story_id", new nxn0.a(2, "story_id", "INTEGER", null, true, 1));
        linkedHashMap3.put("viewsCount", new nxn0.a(0, "viewsCount", "INTEGER", null, true, 1));
        linkedHashMap3.put("answersCount", new nxn0.a(0, "answersCount", "INTEGER", null, true, 1));
        linkedHashMap3.put("reactionsCount", new nxn0.a(0, "reactionsCount", "INTEGER", null, true, 1));
        nxn0 nxn0Var3 = new nxn0("story_statistics_viewers_meta", linkedHashMap3, b690.a(linkedHashMap3, "new_reactions", new nxn0.a(0, "new_reactions", "INTEGER", null, true, 1)), new LinkedHashSet());
        nxn0 a3 = nxn0.b.a(hyg0Var, "story_statistics_viewers_meta");
        if (!nxn0Var3.equals(a3)) {
            return new l.a(false, t3j0.a("story_statistics_viewers_meta(com.vk.story.viewer.stat.data.cache.viewers.viewer.meta.StoryStatisticsViewersMetaEntity).\n Expected:\n", nxn0Var3, "\n Found:\n", a3));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("owner_id", new nxn0.a(1, "owner_id", "INTEGER", null, true, 1));
        nxn0 nxn0Var4 = new nxn0("story_statistics_excluded_users", linkedHashMap4, b690.a(linkedHashMap4, "excludedUsers", new nxn0.a(0, "excludedUsers", "TEXT", null, true, 1)), new LinkedHashSet());
        nxn0 a4 = nxn0.b.a(hyg0Var, "story_statistics_excluded_users");
        if (!nxn0Var4.equals(a4)) {
            return new l.a(false, t3j0.a("story_statistics_excluded_users(com.vk.story.viewer.stat.data.cache.viewers.excludedusers.StoryStatisticsExcludedUsersEntity).\n Expected:\n", nxn0Var4, "\n Found:\n", a4));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("owner_id", new nxn0.a(1, "owner_id", "INTEGER", null, true, 1));
        linkedHashMap5.put("story_id", new nxn0.a(2, "story_id", "INTEGER", null, true, 1));
        linkedHashMap5.put("question_id", new nxn0.a(3, "question_id", "INTEGER", null, true, 1));
        linkedHashMap5.put("date", new nxn0.a(0, "date", "INTEGER", null, true, 1));
        nxn0 nxn0Var5 = new nxn0("story_statistics_question", linkedHashMap5, b690.a(linkedHashMap5, "storyStatisticsQuestion", new nxn0.a(0, "storyStatisticsQuestion", "TEXT", null, true, 1)), new LinkedHashSet());
        nxn0 a5 = nxn0.b.a(hyg0Var, "story_statistics_question");
        if (!nxn0Var5.equals(a5)) {
            return new l.a(false, t3j0.a("story_statistics_question(com.vk.story.viewer.stat.data.cache.stickers.question.StoryStatisticsQuestionEntity).\n Expected:\n", nxn0Var5, "\n Found:\n", a5));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("owner_id", new nxn0.a(1, "owner_id", "INTEGER", null, true, 1));
        linkedHashMap6.put("story_id", new nxn0.a(2, "story_id", "INTEGER", null, true, 1));
        nxn0 nxn0Var6 = new nxn0("story_statistics_questions_meta", linkedHashMap6, b690.a(linkedHashMap6, "totalQuestionsCount", new nxn0.a(0, "totalQuestionsCount", "INTEGER", null, true, 1)), new LinkedHashSet());
        nxn0 a6 = nxn0.b.a(hyg0Var, "story_statistics_questions_meta");
        return !nxn0Var6.equals(a6) ? new l.a(false, t3j0.a("story_statistics_questions_meta(com.vk.story.viewer.stat.data.cache.stickers.question.meta.StoryStatisticsQuestionsMetaEntity).\n Expected:\n", nxn0Var6, "\n Found:\n", a6)) : new l.a(true, null);
    }

    @Override // androidx.room.l
    public final void c() {
    }

    @Override // androidx.room.l
    public final void e() {
    }
}
