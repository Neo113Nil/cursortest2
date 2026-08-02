package xsna;

import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;

/* compiled from: EditorEventsTrackerImpl.kt */
/* loaded from: classes18.dex */
public final class z3p implements y3p {
    public final tz70 a = new tz70();

    /* compiled from: EditorEventsTrackerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryEditorEvents.values().length];
            try {
                iArr[StoryEditorEvents.SAVE_STORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryEditorEvents.CHOOSE_RECEIVERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryEditorEvents.SOUND_ON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoryEditorEvents.SOUND_OFF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoryEditorEvents.EDIT_TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoryEditorEvents.DELETE_TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StoryEditorEvents.ADD_STICKER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StoryEditorEvents.DELETE_STICKER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StoryEditorEvents.EDIT_STICKER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StoryEditorEvents.ADD_GRAFFITI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[StoryEditorEvents.DELETE_GRAFFITI.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[StoryEditorEvents.APPLY_GRAFFITI.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[StoryEditorEvents.CANCEL_GRAFFITI.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[StoryEditorEvents.EDIT_QUESTION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[StoryEditorEvents.GEO_ACCESS_ALLOW.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[StoryEditorEvents.GEO_ACCESS_DECLINE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[StoryEditorEvents.OPEN_BACKGROUND_EDITOR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[StoryEditorEvents.SELECT_BACKGROUND.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[StoryEditorEvents.APPLY_BACKGROUND.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[StoryEditorEvents.CANCEL_BACKGROUND_EDITOR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[StoryEditorEvents.MARK_ADVERTISER.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[StoryEditorEvents.EDIT_ADVERTISER_MARK.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[StoryEditorEvents.ADD_PHOTO_CLIPBOARD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[StoryEditorEvents.ADD_TEXT_CLIPBOARD.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[StoryEditorEvents.CHANGE_PHOTO.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[StoryEditorEvents.CLICK_ON_PRIVACY.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[StoryEditorEvents.CLICK_1H.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[StoryEditorEvents.CLICK_12H.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[StoryEditorEvents.CLICK_24H.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[StoryEditorEvents.CLICK_48H.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[StoryEditorEvents.CHANGE_AUTHOR_LONGTAP.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[StoryEditorEvents.SHOW_BUBBLE_LONGTAP.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[StoryEditorEvents.VIEW_VERTICALIZATION_BANNER.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[StoryEditorEvents.CLICK_ON_TRY_VERTICALIZATION.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[StoryEditorEvents.CLICK_ON_POSTPONE_VERTICALIZATION.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[StoryEditorEvents.APPLY_VERTICALIZATION.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[StoryEditorEvents.CANCEL_VERTICALIZATION.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[StoryEditorEvents.CLICK_ON_VERTICALIZATION_BUTTON.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[StoryEditorEvents.TAKE_SCREENSHOT.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[StoryEditorEvents.SCREENSHOT_OF_VERTICALIZATION_PICKER.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.y3p
    public final void a() {
        this.a.c(StoryPublishEvent.STICKERS_MENU_OPEN);
    }

    @Override // xsna.y3p
    public final void b() {
        this.a.a.a("draw", false);
    }

    @Override // xsna.y3p
    public final void c() {
        this.a.c(StoryPublishEvent.REACTIONS_MENU_OPEN);
    }

    @Override // xsna.y3p
    public final void d() {
        this.a.b(false);
    }

    @Override // xsna.y3p
    public final void e() {
        this.a.d(false);
    }

    @Override // xsna.y3p
    public final void f() {
        this.a.e(false);
    }

    @Override // xsna.y3p
    public final void g() {
        this.a.c(StoryPublishEvent.STICKERS_MENU_CLOSED);
    }

    @Override // xsna.y3p
    public final void h() {
        this.a.c(StoryPublishEvent.STICKER_ADDING_CANCELED);
    }

    @Override // xsna.y3p
    public final void i(StoryEditorEvents storyEditorEvents) {
        StoryPublishEvent storyPublishEvent;
        switch (a.$EnumSwitchMapping$0[storyEditorEvents.ordinal()]) {
            case 1:
                storyPublishEvent = StoryPublishEvent.SAVE_STORY;
                break;
            case 2:
                storyPublishEvent = StoryPublishEvent.CHOOSE_RECEIVERS;
                break;
            case 3:
                storyPublishEvent = StoryPublishEvent.SOUND_ON;
                break;
            case 4:
                storyPublishEvent = StoryPublishEvent.SOUND_OFF;
                break;
            case 5:
                storyPublishEvent = StoryPublishEvent.EDIT_TEXT;
                break;
            case 6:
                storyPublishEvent = StoryPublishEvent.DELETE_TEXT;
                break;
            case 7:
                storyPublishEvent = StoryPublishEvent.ADD_STICKER;
                break;
            case 8:
                storyPublishEvent = StoryPublishEvent.DELETE_STICKER;
                break;
            case 9:
                storyPublishEvent = StoryPublishEvent.EDIT_STICKER;
                break;
            case 10:
                storyPublishEvent = StoryPublishEvent.ADD_GRAFFITI;
                break;
            case 11:
                storyPublishEvent = StoryPublishEvent.DELETE_GRAFFITI;
                break;
            case 12:
                storyPublishEvent = StoryPublishEvent.APPLY_GRAFFITI;
                break;
            case 13:
                storyPublishEvent = StoryPublishEvent.CANCEL_GRAFFITI;
                break;
            case 14:
                storyPublishEvent = StoryPublishEvent.EDIT_QUESTION;
                break;
            case 15:
                storyPublishEvent = StoryPublishEvent.GEO_ACCESS_ALLOW;
                break;
            case 16:
                storyPublishEvent = StoryPublishEvent.GEO_ACCESS_DECLINE;
                break;
            case 17:
                storyPublishEvent = StoryPublishEvent.OPEN_BACKGROUND_EDITOR;
                break;
            case 18:
                storyPublishEvent = StoryPublishEvent.SELECT_BACKGROUND;
                break;
            case 19:
                storyPublishEvent = StoryPublishEvent.APPLY_BACKGROUND;
                break;
            case 20:
                storyPublishEvent = StoryPublishEvent.CANCEL_BACKGROUND_EDITOR;
                break;
            case 21:
                storyPublishEvent = StoryPublishEvent.MARK_ADVERTISER;
                break;
            case 22:
                storyPublishEvent = StoryPublishEvent.EDIT_ADVERTISER_MARK;
                break;
            case 23:
                storyPublishEvent = StoryPublishEvent.ADD_PHOTO_CLIPBOARD;
                break;
            case 24:
                storyPublishEvent = StoryPublishEvent.ADD_TEXT_CLIPBOARD;
                break;
            case 25:
                storyPublishEvent = StoryPublishEvent.CHANGE_PHOTO;
                break;
            case 26:
                storyPublishEvent = StoryPublishEvent.CLICK_ON_PRIVACY;
                break;
            case 27:
                storyPublishEvent = StoryPublishEvent.CLICK_1H;
                break;
            case 28:
                storyPublishEvent = StoryPublishEvent.CLICK_12H;
                break;
            case 29:
                storyPublishEvent = StoryPublishEvent.CLICK_24H;
                break;
            case 30:
                storyPublishEvent = StoryPublishEvent.CLICK_48H;
                break;
            case 31:
                storyPublishEvent = StoryPublishEvent.CHANGE_AUTHOR_LONGTAP;
                break;
            case 32:
                storyPublishEvent = StoryPublishEvent.SHOW_BUBBLE_LONGTAP;
                break;
            case 33:
                storyPublishEvent = StoryPublishEvent.VIEW_VERTICALIZATION_BANNER;
                break;
            case 34:
                storyPublishEvent = StoryPublishEvent.CLICK_ON_TRY_VERTICALIZATION;
                break;
            case 35:
                storyPublishEvent = StoryPublishEvent.CLICK_ON_POSTPONE_VERTICALIZATION;
                break;
            case 36:
                storyPublishEvent = StoryPublishEvent.APPLY_VERTICALIZATION;
                break;
            case 37:
                storyPublishEvent = StoryPublishEvent.CANCEL_VERTICALIZATION;
                break;
            case 38:
                storyPublishEvent = StoryPublishEvent.CLICK_ON_VERTICALIZATION_BUTTON;
                break;
            case 39:
                storyPublishEvent = StoryPublishEvent.TAKE_SCREENSHOT;
                break;
            case 40:
                storyPublishEvent = StoryPublishEvent.SCREENSHOT_OF_VERTICALIZATION_PICKER;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.a.c(storyPublishEvent);
    }

    @Override // xsna.y3p
    public final void j(StoryUploadParams storyUploadParams, CommonUploadParams commonUploadParams, WebStoryBox webStoryBox) {
        nf9.j(StoryPublishEvent.OPEN_EDITOR, null, storyUploadParams, commonUploadParams, new mh4(11, webStoryBox, storyUploadParams), 16);
    }

    @Override // xsna.y3p
    public final void k() {
        nf9.b.g();
    }

    @Override // xsna.y3p
    public final void l() {
        l1m0 b;
        tz70 tz70Var = this.a;
        tj8 tj8Var = tz70Var.b;
        j3p j3pVar = tz70Var.a;
        if (tj8Var == null || (b = tj8Var.b()) == null) {
            return;
        }
        tz70Var.d(true);
        tz70Var.b(true);
        tz70Var.e(true);
        if (!b.g) {
            j3pVar.a("draw", true);
        }
        j3pVar.a.postDelayed(new k3p(j3pVar, 0), 1000L);
    }

    @Override // xsna.y3p
    public final void m(tam0 tam0Var, StoryUploadParams storyUploadParams) {
        if (tam0Var == null) {
            tam0Var = null;
        }
        if (tam0Var == null) {
            return;
        }
        this.a.a(tam0Var, storyUploadParams);
    }

    @Override // xsna.y3p
    public final void n(CommonUploadParams commonUploadParams, StoryUploadParams storyUploadParams) {
        nf9.b.h(true, storyUploadParams, commonUploadParams);
    }

    @Override // xsna.y3p
    public final void o(CommonUploadParams commonUploadParams, StoryUploadParams storyUploadParams) {
        nf9.b(nf9.b, StoryPublishEvent.ADD_FRAME, null, storyUploadParams, commonUploadParams != null ? CommonUploadParams.zb(commonUploadParams, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_EDITOR)) : null, false, null, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE).e();
    }

    @Override // xsna.y3p
    public final void p(String str) {
        this.a.a.c = str;
    }

    @Override // xsna.y3p
    public final void q() {
        this.a.c(StoryPublishEvent.STICKERS_MENU_STICKER_CLICKED);
    }

    @Override // xsna.y3p
    public final void r(boolean z) {
        l1m0 b;
        tj8 tj8Var = this.a.b;
        if (tj8Var == null || (b = tj8Var.b()) == null) {
            return;
        }
        b.d dVar = new b.d("stories_editor_screen");
        dVar.b(b.b, "type");
        dVar.b(z ? "go_back" : "next", "action");
        JSONArray jSONArray = new JSONArray();
        if (b.c) {
            jSONArray.put("use_text");
        }
        if (b.d) {
            jSONArray.put("use_drawing");
        }
        if (b.e) {
            jSONArray.put("use_stickers");
        }
        if (b.f) {
            jSONArray.put("save");
        }
        dVar.b(jSONArray, "action_facts");
        dVar.h();
    }

    @Override // xsna.y3p
    public final void s(int i) {
        this.a.a.d = Integer.valueOf(i);
    }

    @Override // xsna.y3p
    public final void t(tj8 tj8Var) {
        this.a.b = tj8Var;
    }
}
