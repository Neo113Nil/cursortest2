package com.ybsdk.core.stories.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\nHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006#"}, d2 = {"Lcom/ybsdk/core/stories/dto/StoriesResponse;", "", "storyItemsList", "", "Lcom/ybsdk/core/stories/dto/StoryItem;", "primaryButton", "Lcom/ybsdk/core/stories/dto/CommunicationFullScreenButton;", "legalAgreement", "Lcom/ybsdk/core/stories/dto/LegalAgreement;", "actionAfterLast", "", "overriddenCloseAction", "<init>", "(Ljava/util/List;Lcom/ybsdk/core/stories/dto/CommunicationFullScreenButton;Lcom/ybsdk/core/stories/dto/LegalAgreement;Ljava/lang/String;Ljava/lang/String;)V", "getStoryItemsList", "()Ljava/util/List;", "getPrimaryButton", "()Lcom/ybsdk/core/stories/dto/CommunicationFullScreenButton;", "getLegalAgreement", "()Lcom/ybsdk/core/stories/dto/LegalAgreement;", "getActionAfterLast", "()Ljava/lang/String;", "getOverriddenCloseAction", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoriesResponse {
    private final String actionAfterLast;
    private final LegalAgreement legalAgreement;
    private final String overriddenCloseAction;
    private final CommunicationFullScreenButton primaryButton;
    private final List<StoryItem> storyItemsList;

    public StoriesResponse(@Json(name = "stories") List<StoryItem> list, @Json(name = "primary_button") CommunicationFullScreenButton communicationFullScreenButton, @Json(name = "legal_agreement") LegalAgreement legalAgreement, @Json(name = "action_after_last_story") String str, @Json(name = "overridden_close_action") String str2) {
        this.storyItemsList = list;
        this.primaryButton = communicationFullScreenButton;
        this.legalAgreement = legalAgreement;
        this.actionAfterLast = str;
        this.overriddenCloseAction = str2;
    }

    public static /* synthetic */ StoriesResponse copy$default(StoriesResponse storiesResponse, List list, CommunicationFullScreenButton communicationFullScreenButton, LegalAgreement legalAgreement, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = storiesResponse.storyItemsList;
        }
        if ((i & 2) != 0) {
            communicationFullScreenButton = storiesResponse.primaryButton;
        }
        if ((i & 4) != 0) {
            legalAgreement = storiesResponse.legalAgreement;
        }
        if ((i & 8) != 0) {
            str = storiesResponse.actionAfterLast;
        }
        if ((i & 16) != 0) {
            str2 = storiesResponse.overriddenCloseAction;
        }
        String str3 = str2;
        LegalAgreement legalAgreement2 = legalAgreement;
        return storiesResponse.copy(list, communicationFullScreenButton, legalAgreement2, str, str3);
    }

    public final List<StoryItem> component1() {
        return this.storyItemsList;
    }

    /* renamed from: component2, reason: from getter */
    public final CommunicationFullScreenButton getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component3, reason: from getter */
    public final LegalAgreement getLegalAgreement() {
        return this.legalAgreement;
    }

    /* renamed from: component4, reason: from getter */
    public final String getActionAfterLast() {
        return this.actionAfterLast;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOverriddenCloseAction() {
        return this.overriddenCloseAction;
    }

    public final StoriesResponse copy(@Json(name = "stories") List<StoryItem> storyItemsList, @Json(name = "primary_button") CommunicationFullScreenButton primaryButton, @Json(name = "legal_agreement") LegalAgreement legalAgreement, @Json(name = "action_after_last_story") String actionAfterLast, @Json(name = "overridden_close_action") String overriddenCloseAction) {
        return new StoriesResponse(storyItemsList, primaryButton, legalAgreement, actionAfterLast, overriddenCloseAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoriesResponse)) {
            return false;
        }
        StoriesResponse storiesResponse = (StoriesResponse) other;
        return jl40.l(this.storyItemsList, storiesResponse.storyItemsList) && jl40.l(this.primaryButton, storiesResponse.primaryButton) && jl40.l(this.legalAgreement, storiesResponse.legalAgreement) && jl40.l(this.actionAfterLast, storiesResponse.actionAfterLast) && jl40.l(this.overriddenCloseAction, storiesResponse.overriddenCloseAction);
    }

    public final String getActionAfterLast() {
        return this.actionAfterLast;
    }

    public final LegalAgreement getLegalAgreement() {
        return this.legalAgreement;
    }

    public final String getOverriddenCloseAction() {
        return this.overriddenCloseAction;
    }

    public final CommunicationFullScreenButton getPrimaryButton() {
        return this.primaryButton;
    }

    public final List<StoryItem> getStoryItemsList() {
        return this.storyItemsList;
    }

    public int hashCode() {
        List<StoryItem> list = this.storyItemsList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        CommunicationFullScreenButton communicationFullScreenButton = this.primaryButton;
        int hashCode2 = (hashCode + (communicationFullScreenButton == null ? 0 : communicationFullScreenButton.hashCode())) * 31;
        LegalAgreement legalAgreement = this.legalAgreement;
        int hashCode3 = (hashCode2 + (legalAgreement == null ? 0 : legalAgreement.hashCode())) * 31;
        String str = this.actionAfterLast;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.overriddenCloseAction;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        List<StoryItem> list = this.storyItemsList;
        CommunicationFullScreenButton communicationFullScreenButton = this.primaryButton;
        LegalAgreement legalAgreement = this.legalAgreement;
        String str = this.actionAfterLast;
        String str2 = this.overriddenCloseAction;
        StringBuilder sb = new StringBuilder("StoriesResponse(storyItemsList=");
        sb.append(list);
        sb.append(", primaryButton=");
        sb.append(communicationFullScreenButton);
        sb.append(", legalAgreement=");
        sb.append(legalAgreement);
        sb.append(", actionAfterLast=");
        sb.append(str);
        sb.append(", overriddenCloseAction=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
