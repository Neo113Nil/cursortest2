package xsna;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.squareup.wire.Message;
import com.vk.api.generated.shortVideo.dto.ShortVideoChallengeBannerButtonDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoChallengeBannerDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.common.domain.model.AddLikeAction;
import com.vk.newsfeed.impl.data.database.entity.action.ActionWithOfflineSupportTypeEntity;
import com.vk.newsfeed.impl.data.database.entity.action.post.AddLikeActionEntity;
import com.vk.newsfeed.impl.data.database.entity.action.post.DeleteLikeActionEntity;
import com.vk.newsfeed.impl.data.database.entity.action.post.LikableItemTypeEntity;
import com.vk.newsfeed.impl.data.database.entity.action.post.a;
import com.vk.newsfeed.impl.domain.model.ActionWithOfflineSupportType;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import xsna.a3p0;
import xsna.cn00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class t30 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t30(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AddLikeActionEntity.TriggerTypeEntity triggerTypeEntity;
        Message addLikeActionEntity;
        AddLikeActionEntity.TriggerTypeEntity triggerTypeEntity2;
        ShortVideoChallengeBannerButtonDto d;
        ShortVideoChallengeBannerButtonDto d2;
        String title;
        String description;
        String title2;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                v30 v30Var = (v30) obj3;
                ActionWithOfflineSupportType actionWithOfflineSupportType = (ActionWithOfflineSupportType) obj;
                y60 b = v30Var.b();
                int i2 = cn00.a.$EnumSwitchMapping$1[actionWithOfflineSupportType.ordinal()];
                if (i2 == 1) {
                    AddLikeAction addLikeAction = (AddLikeAction) obj2;
                    LikableItemTypeEntity a = com.vk.newsfeed.impl.data.database.entity.action.post.a.a(addLikeAction.a);
                    long j = addLikeAction.b;
                    UserId userId = addLikeAction.c;
                    Long valueOf = userId != null ? Long.valueOf(userId.b) : null;
                    Integer num = addLikeAction.d;
                    String str = addLikeAction.e;
                    String str2 = addLikeAction.f;
                    String str3 = addLikeAction.g;
                    AddLikeAction.TriggerType triggerType = addLikeAction.h;
                    if (triggerType != null) {
                        int i3 = a.C1378a.$EnumSwitchMapping$0[triggerType.ordinal()];
                        if (i3 == 1) {
                            triggerTypeEntity2 = AddLikeActionEntity.TriggerTypeEntity.BUTTON;
                        } else if (i3 == 2) {
                            triggerTypeEntity2 = AddLikeActionEntity.TriggerTypeEntity.DOUBLE_TAP;
                        } else if (i3 == 3) {
                            triggerTypeEntity2 = AddLikeActionEntity.TriggerTypeEntity.REACTIONS_MODAL;
                        } else {
                            if (i3 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            triggerTypeEntity2 = AddLikeActionEntity.TriggerTypeEntity.REACTIONS_POPUP;
                        }
                        triggerTypeEntity = triggerTypeEntity2;
                    } else {
                        triggerTypeEntity = null;
                    }
                    addLikeActionEntity = new AddLikeActionEntity(a, j, valueOf, num, str, str2, str3, triggerTypeEntity, 256);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dvl dvlVar = (dvl) obj2;
                    LikableItemTypeEntity a2 = com.vk.newsfeed.impl.data.database.entity.action.post.a.a(dvlVar.a);
                    long j2 = dvlVar.b;
                    UserId userId2 = dvlVar.c;
                    addLikeActionEntity = new DeleteLikeActionEntity(a2, j2, userId2 != null ? Long.valueOf(userId2.b) : null, dvlVar.d, dvlVar.e, dvlVar.f, 64);
                }
                ActionWithOfflineSupportTypeEntity b2 = cn00.b(actionWithOfflineSupportType);
                g00 a3 = b.a(b2);
                SQLiteDatabase sQLiteDatabase = b.a;
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("action", a3.a(addLikeActionEntity));
                contentValues.put("action_type", b2.h());
                s3q0 s3q0Var = s3q0.a;
                long insert = sQLiteDatabase.insert("actions_with_offline_support", null, contentValues);
                if (0 >= insert) {
                    throw new Exception("Can't persist new action " + obj2 + JwtParser.SEPARATOR_CHAR);
                }
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"Offline:ActionLocalRepositoryImpl", qlb0.a(insert, "Notify new action ", " has been successfully saved in DB.")});
                }
                v30Var.c.onNext(new b70(insert));
                return new b70(insert);
            default:
                Image image = (Image) obj3;
                ShortVideoChallengeBannerDto shortVideoChallengeBannerDto = (ShortVideoChallengeBannerDto) obj2;
                String str4 = (String) obj;
                Image image2 = !image.b.isEmpty() ? image : null;
                if (image2 == null) {
                    return null;
                }
                return new a3p0.a.C2519a(str4, (shortVideoChallengeBannerDto == null || (title2 = shortVideoChallengeBannerDto.getTitle()) == null) ? tq.h(tlo0.Companion, R.string.clips_grid_trends_banner_header) : oq.d(tlo0.Companion, title2), (shortVideoChallengeBannerDto == null || (description = shortVideoChallengeBannerDto.getDescription()) == null) ? tq.h(tlo0.Companion, R.string.clips_grid_trends_banner_subhead) : oq.d(tlo0.Companion, description), (shortVideoChallengeBannerDto == null || (d2 = shortVideoChallengeBannerDto.d()) == null || (title = d2.getTitle()) == null) ? tq.h(tlo0.Companion, R.string.clips_grid_trends_banner_button_text) : oq.d(tlo0.Companion, title), (shortVideoChallengeBannerDto == null || (d = shortVideoChallengeBannerDto.d()) == null) ? null : d.getUrl(), image2, shortVideoChallengeBannerDto != null ? Long.valueOf(shortVideoChallengeBannerDto.f()) : null);
        }
    }
}
