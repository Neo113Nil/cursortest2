package com.vkontakte.android.attachments;

import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderTextDto;
import com.vk.api.generated.wall.dto.WallActionButtonTypeDto;
import com.vk.api.generated.wall.dto.WallActionButtonVkTicketDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.action_button.ActionButtonDonutGoal;
import com.vk.dto.action_button.ActionButtonDonutLevel;
import com.vk.dto.action_button.ActionButtonProgress;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.actions.Action;
import xsna.drm0;
import xsna.epx;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ActionButtonAttachment.kt */
/* loaded from: classes7.dex */
public final class ActionButtonAttachment extends Attachment {
    public static final Serializer.c<ActionButtonAttachment> CREATOR = new a();
    public final String f;
    public final String g;
    public final Action h;
    public final ActionButtonProgress i;
    public final ActionButtonDonutGoal j;
    public final ActionButtonDonutLevel k;
    public final NewsfeedNewsfeedItemHeaderTextDto l;
    public final String m;
    public final String n;
    public final WallActionButtonVkTicketDto o;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionButtonAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionButtonAttachment a(Serializer serializer) {
            return new ActionButtonAttachment(serializer.H(), serializer.H(), (Action) serializer.G(Action.class.getClassLoader()), (ActionButtonProgress) serializer.G(ActionButtonProgress.class.getClassLoader()), (ActionButtonDonutGoal) serializer.G(ActionButtonDonutGoal.class.getClassLoader()), (ActionButtonDonutLevel) serializer.G(ActionButtonDonutLevel.class.getClassLoader()), (NewsfeedNewsfeedItemHeaderTextDto) serializer.A(NewsfeedNewsfeedItemHeaderTextDto.class.getClassLoader()), serializer.I(), serializer.I(), (WallActionButtonVkTicketDto) serializer.A(WallActionButtonVkTicketDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionButtonAttachment[i];
        }
    }

    public /* synthetic */ ActionButtonAttachment(String str, String str2, Action action, ActionButtonProgress actionButtonProgress, ActionButtonDonutGoal actionButtonDonutGoal, ActionButtonDonutLevel actionButtonDonutLevel, NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, String str3, String str4, WallActionButtonVkTicketDto wallActionButtonVkTicketDto, int i, zcl zclVar) {
        this(str, str2, action, actionButtonProgress, actionButtonDonutGoal, actionButtonDonutLevel, (i & 64) != 0 ? null : newsfeedNewsfeedItemHeaderTextDto, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : wallActionButtonVkTicketDto);
    }

    public final boolean Db() {
        return epx.f(this.f, "donut_goal");
    }

    public final boolean Eb() {
        String str = this.m;
        return true ^ (str == null || drm0.N(str));
    }

    public final boolean Fb() {
        return epx.f(this.f, WallActionButtonTypeDto.VK_TICKET.j());
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.i0(this.h);
        serializer.i0(this.i);
        serializer.i0(this.j);
        serializer.i0(this.k);
        serializer.m0(this.m);
        serializer.m0(this.n);
        serializer.e0(this.l);
        serializer.e0(this.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionButtonAttachment)) {
            return false;
        }
        ActionButtonAttachment actionButtonAttachment = (ActionButtonAttachment) obj;
        return epx.f(this.f, actionButtonAttachment.f) && epx.f(this.g, actionButtonAttachment.g) && epx.f(this.h, actionButtonAttachment.h) && epx.f(this.i, actionButtonAttachment.i) && epx.f(this.j, actionButtonAttachment.j) && epx.f(this.k, actionButtonAttachment.k) && epx.f(this.l, actionButtonAttachment.l) && epx.f(this.m, actionButtonAttachment.m) && epx.f(this.n, actionButtonAttachment.n) && epx.f(this.o, actionButtonAttachment.o);
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + urd0.a(this.f.hashCode() * 31, 31, this.g)) * 31;
        ActionButtonProgress actionButtonProgress = this.i;
        int hashCode2 = (hashCode + (actionButtonProgress == null ? 0 : Integer.hashCode(actionButtonProgress.b))) * 31;
        ActionButtonDonutGoal actionButtonDonutGoal = this.j;
        int hashCode3 = (hashCode2 + (actionButtonDonutGoal == null ? 0 : Long.hashCode(actionButtonDonutGoal.b))) * 31;
        ActionButtonDonutLevel actionButtonDonutLevel = this.k;
        int hashCode4 = (hashCode3 + (actionButtonDonutLevel == null ? 0 : Long.hashCode(actionButtonDonutLevel.b))) * 31;
        NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto = this.l;
        int hashCode5 = (hashCode4 + (newsfeedNewsfeedItemHeaderTextDto == null ? 0 : newsfeedNewsfeedItemHeaderTextDto.hashCode())) * 31;
        String str = this.m;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.n;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WallActionButtonVkTicketDto wallActionButtonVkTicketDto = this.o;
        return hashCode7 + (wallActionButtonVkTicketDto != null ? wallActionButtonVkTicketDto.hashCode() : 0);
    }

    public final String toString() {
        return "ActionButtonAttachment(type=" + this.f + ", title=" + this.g + ", action=" + this.h + ", progress=" + this.i + ", donutGoal=" + this.j + ", donutLevel=" + this.k + ", subtitle=" + this.l + ", actionTitle=" + this.m + ", accessibilityTitle=" + this.n + ", vkTicketInfo=" + this.o + ')';
    }

    public ActionButtonAttachment(String str, String str2, Action action, ActionButtonProgress actionButtonProgress, ActionButtonDonutGoal actionButtonDonutGoal, ActionButtonDonutLevel actionButtonDonutLevel, NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, String str3, String str4, WallActionButtonVkTicketDto wallActionButtonVkTicketDto) {
        this.f = str;
        this.g = str2;
        this.h = action;
        this.i = actionButtonProgress;
        this.j = actionButtonDonutGoal;
        this.k = actionButtonDonutLevel;
        this.l = newsfeedNewsfeedItemHeaderTextDto;
        this.m = str3;
        this.n = str4;
        this.o = wallActionButtonVkTicketDto;
    }
}
