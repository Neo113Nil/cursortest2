package xsna;

import android.os.SystemClock;
import com.huawei.hms.common.data.DataHolder;
import com.ironsource.InterfaceC4319fe;
import com.ironsource.InterfaceC4413l1;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vk.auth.smartflow.impl.mail.MailSmartflowComponentImpl;
import com.vk.clips.attachments.api.di.ClipsAttachmentsComponentStub;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridLikedClipsListFragment;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.preference.Preference;
import com.vk.geo.impl.presentation.staticpreview.GeoStaticPreview;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.im.ui.fragments.DialogsFragment;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.reefton.trackers.c;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.FeedFeatures;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import kotlin.random.Random;
import kotlin.text.Regex;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.commons.http.Http;
import ru.ok.android.webrtc.stat.cpu.processor.ProcessorStatistics;
import ru.ok.gl.tf.Tensorflow;
import xsna.ihc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class lz2 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ lz2(int i) {
        this.b = i;
    }

    private final Object a() {
        return pn00.k(new Pair(1, "type_footer"), new Pair(2, "type_text"), new Pair(3, "type_repost"), new Pair(5, "type_thumbs_block"), new Pair(6, "type_audio_attach"), new Pair(7, "type_attachment_animation"), new Pair(10, "type_buttons"), new Pair(11, "type_attachment_single_document_thumb"), new Pair(13, "type_profiles_recommendations"), new Pair(14, "type_footer_ad"), new Pair(15, "type_ad_goods_block"), new Pair(8, "type_ad_goods_block_special"), new Pair(Integer.valueOf(ApiInvocationException.ErrorCodes.GROUP_RESTRICTION), "type_dzen_news_block_header"), new Pair(Integer.valueOf(ApiInvocationException.ErrorCodes.UNAUTHORIZED_RESTRICTION), "type_dzen_news_block"), new Pair(16, "type_tag_confirmation"), new Pair(17, "type_padding"), new Pair(18, "type_activity_likes"), new Pair(19, "type_activity_comment"), new Pair(21, "type_marked_as_ads"), new Pair(30, "type_news_latest"), new Pair(31, "type_header_list"), new Pair(32, "type_promo_button"), new Pair(33, "type_geo_address"), new Pair(34, "type_geo_check_in"), new Pair(35, "type_geo_map"), new Pair(36, "type_geo_map_with_address"), new Pair(37, DataHolder.TYPE_STRING), new Pair(38, "type_profile_deleted_text"), new Pair(39, "type_attachment_document_file"), new Pair(40, "type_attachment_poll"), new Pair(41, "type_attachment_snippet_small"), new Pair(42, "type_attachment_snippet_big"), new Pair(43, "type_attachment_link"), new Pair(44, "type_attachment_wiki"), new Pair(45, "type_attachment_audio_playlist"), new Pair(46, "type_attachment_market_item"), new Pair(47, "type_attachment_article_small"), new Pair(48, "type_attachment_article_big"), new Pair(49, "type_attachment_pretty_cards"), new Pair(50, "type_attachment_single_photo"), new Pair(51, "type_attachment_single_video"), new Pair(52, "type_attachment_single_album"), new Pair(53, "type_attachment_single_market_album"), new Pair(54, "type_attachment_note"), new Pair(56, "type_ads_easy_promote_button"), new Pair(57, "type_ads_easy_promote_state"), new Pair(58, "type_attachment_autoplay_video"), new Pair(59, "type_attachment_autoplay_video_with_footer"), new Pair(353, "type_attachment_autoplay_clip_with_footer"), new Pair(60, "type_inline_comment_text"), new Pair(65, "type_inline_writebar"), new Pair(66, "type_attachment_sticker"), new Pair(67, "type_attachment_sticker_animated"), new Pair(68, "type_attachment_graffiti"), new Pair(69, "type_board_topic_preview"), new Pair(70, "type_attachment_podcast"), new Pair(71, "type_attachment_video_snippet"), new Pair(72, "type_attachment_video_snippet_footer"), new Pair(73, "type_footer_with_likes"), new Pair(341, "type_clip_footer_with_likes"), new Pair(74, "type_show_more_comments"), new Pair(75, "type_poster"), new Pair(76, "type_attachment_audio_artist"), new Pair(77, "type_narrative"), new Pair(78, "type_expand_cut"), new Pair(79, "type_attachment_pending_document_file"), new Pair(80, "type_attachment_audio_playlist_small"), new Pair(81, "type_attachment_event"), new Pair(83, "type_attachment_snippet_compact"), qz9.g(84, "type_copyright"), qz9.g(85, "type_digest_header"), qz9.g(86, "type_digest_grid"), qz9.g(87, "type_digest_list_item"), qz9.g(88, "type_digest_footer"), qz9.g(89, "type_activity_event"), qz9.g(93, "type_comments_dropdown"), qz9.g(95, "type_attachment_market_compact_item"), qz9.g(96, "type_attachment_podcast_restricted"), qz9.g(97, "type_repost_compact"), qz9.g(100, "type_feedback_block"), qz9.g(102, "type_html5_ad"), qz9.g(108, "type_donut_post_placeholder"), qz9.g(109, "type_restricted_photo"), qz9.g(110, "type_restricted_blurred_photo"), qz9.g(111, "type_restricted_blurred_photo_album"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE), "type_clips"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), "type_divider"), qz9.g(116, "type_groups_recommendations"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), "type_channels_recommendations"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), "type_horizontal_gallery"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), "type_activity_repost_to_story"), qz9.g(127, "type_mini_apps_carousel"), qz9.g(320, "type_games_carousel"), qz9.g(128, "type_carousel_footer"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE), "type_tag_suggested_confirmation"), qz9.g(139, "type_digest_inversed_list_item"), qz9.g(Integer.valueOf(VersionConstants.PRODUCT_MAJOR_VERSION), "type_digest_footer_button"), qz9.g(141, "type_playlist_carousel"), qz9.g(142, "type_artist_carousel"), qz9.g(143, "type_attachment_audio_curator"), qz9.g(144, "type_attachment_audio_curator_small"), qz9.g(145, "type_friends_tags_confirmation"), qz9.g(146, "type_music_tracks_carousel"), qz9.g(147, "type_tags_suggestions_info"), qz9.g(148, "type_attachment_donut_link"), qz9.g(149, "type_attachment_situation_suggest"), qz9.g(150, "type_attachment_situation_suggest_deleted"), qz9.g(152, "type_attachment_audio_artist_small"), qz9.g(153, "type_expert_card"), qz9.g(154, "type_digest_spotlight_list_item"), qz9.g(157, "type_attachment_snippet_classified_job"), qz9.g(158, "type_attachment_snippet_classified_job_compact"), qz9.g(159, "type_tagged_photos_snippet"), qz9.g(165, "type_product_carousel"), qz9.g(178, "type_shitty_description"), qz9.g(181, "type_compact_repost_header"), qz9.g(182, "type_video_postcard"), qz9.g(184, "type_friends_entry_points"), qz9.g(187, "type_geo_compact"), qz9.g(Integer.valueOf(PsExtractor.PRIVATE_STREAM_1), "type_galvita_thumbs_grid"), qz9.g(191, "type_attachment_snippet_vmoji"), qz9.g(Integer.valueOf(PsExtractor.AUDIO_STREAM), "type_compact_attachment"), qz9.g(193, "type_compact_predefined_attachment"), qz9.g(194, "type_compact_audio_attachment"), qz9.g(199, "type_confirmation_footer"), qz9.g(202, "type_block_header"), qz9.g(203, "type_primary_attachment_single_photo"), qz9.g(204, "type_primary_restricted_blurred_photo"), qz9.g(205, "type_primary_restricted_photo"), qz9.g(206, "type_primary_attachment_single_document_thumb"), qz9.g(207, "type_primary_attachment_animation"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE), "type_primary_attachment_single_video"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE), "type_primary_attachment_single_album"), qz9.g(211, "type_primary_attachment_audio_playlist"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE), "type_primary_attachment_single_market_album"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE), "type_primary_attachment_graffiti"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE), "type_primary_attachment_link_v2"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE), "type_primary_attachment_audio"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE), "type_repost_show_more_button_chevron"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE), "type_repost_show_more_button_borderless"), qz9.g(224, "type_repost_show_more_button_wide"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE), "type_ux_polls"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE), "type_composite_clip_attachment"), qz9.g(231, "type_repost_composite_clip_attachment"), qz9.g(233, "type_discover_media_block"), qz9.g(234, "type_postponed_footer"), qz9.g(237, "type_attachment_article_compact"), qz9.g(238, "type_compact_market_attachment"), qz9.g(Integer.valueOf(PsExtractor.VIDEO_STREAM_MASK), "type_dzen_header"), qz9.g(241, "type_dzen_item"), qz9.g(242, "type_dzen_footer"), qz9.g(243, "type_dzen_story"), qz9.g(245, "type_market_blocked_attachment"), qz9.g(246, "type_block_footer"), qz9.g(247, "type_discover_media_block_skeleton"), qz9.g(248, "type_comments_video_sorted"), qz9.g(Integer.valueOf(InterfaceC4319fe.a.e), "type_discover_media_item_photo_2"), qz9.g(1207, "type_discover_media_item_video_2"), qz9.g(Integer.valueOf(InterfaceC4319fe.a.c), "type_discover_media_item_video_preview"), qz9.g(Integer.valueOf(InterfaceC4319fe.a.g), "type_discover_media_item_text"), qz9.g(1208, "type_discover_media_item_community_photo"), qz9.g(1209, "type_discover_media_item_community_geo"), qz9.g(Integer.valueOf(InterfaceC4319fe.a.j), "type_discover_media_item_restriction_community"), qz9.g(1204, "type_discover_media_item_blurred"), qz9.g(1205, "type_discover_media_item_blurred_restriction"), qz9.g(252, "type_skeleton_block_header"), qz9.g(259, "type_skeleton_error_block_header"), qz9.g(257, "type_primary_attachment_autoplay_video_wide_no_info"), qz9.g(258, "type_primary_attachment_single_video_wide_no_info"), qz9.g(263, "type_feedback_stars_controls_v2"), qz9.g(264, "type_feedback_buttons_controls_v2"), qz9.g(265, "type_info_block"), qz9.g(268, "type_attachment_snippet_seller_product"), qz9.g(269, "type_attachment_snipper_seller_product_compact"), qz9.g(Integer.valueOf(atv0.b), "type_separator_top"), qz9.g(279, "type_ignored_footer"), qz9.g(284, "type_skeleton_digest_block"), qz9.g(285, "type_skeleton_with_retry_footer"), qz9.g(286, "type_feed_digest_inversed_list_item"), qz9.g(Integer.valueOf(MBSupportMuteAdType.INTERSTITIAL_VIDEO), "type_feed_digest_spotlight_list_item"), qz9.g(288, "type_hide_block_header"), qz9.g(289, "type_hide_block_option"), qz9.g(291, "type_clips_retention"), qz9.g(293, "type_primary_attachment_poll_v2"), qz9.g(295, "type_mini_app_recommended_v2"), qz9.g(296, "type_caption_v2"), qz9.g(297, "type_booking_attachment"), qz9.g(299, "type_composite_shitty_clip"), qz9.g(301, "type_shitty_action_button"), qz9.g(302, "type_post_header"), qz9.g(Integer.valueOf(Http.StatusCode.SEE_OTHER), "type_composite_single_clip_v2"), qz9.g(337, "type_composite_promo_clip"), qz9.g(307, "type_shitty_disclaimer"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE), "type_animated_block_v2"), qz9.g(373, "type_fave_market_good"), qz9.g(374, "type_fave_market_service"), qz9.g(376, "type_attachment_fave_snippet_big"), qz9.g(377, "type_fave_small_link"), qz9.g(378, "type_fave_small_article"), qz9.g(379, "type_fave_small_video"), qz9.g(381, "type_fave_small_narrative"), qz9.g(382, "type_attachment_fave_snippet_middle"), qz9.g(383, "type_carousel"), qz9.g(384, "type_attachment_fave_big_product_snippet"), qz9.g(390, "type_favorite_classified_job_big"), qz9.g(391, "type_favorite_classified_redesigned"), qz9.g(392, "type_favorite_market_blocked_small"), qz9.g(393, "type_favorite_market_blocked_large"), qz9.g(394, "type_favorite_donut_badge"), qz9.g(395, "type_favorite_text_donut_badge"), qz9.g(396, "type_fave_grid_market_good"), qz9.g(397, "type_fave_tags_with_divider"), qz9.g(401, "type_fave_grid_blocked_market_good"), qz9.g(402, "type_favorite_seller_product"), qz9.g(366, "type_buttons_edit_delete"), qz9.g(1101, "type_news_stories"), qz9.g(Integer.valueOf(ApiInvocationException.ErrorCodes.FRIENDSHIP_REQUIRED), "type_create_post"), qz9.g(1104, "type_placeholder"), qz9.g(1105, "type_situational_post"), qz9.g(1106, "type_post_draft"), qz9.g(1107, "type_fave_pages"), qz9.g(1108, "type_photos_like"), qz9.g(1109, "type_feed_likes_filter"), qz9.g(1110, "type_placeholder_feed_likes"), qz9.g(1111, "type_elongated_story_block"), qz9.g(1112, "type_fave_divider"), qz9.g(1113, "type_fave_empty"), qz9.g(1114, "type_fave_likes_entry_point"), qz9.g(1115, "type_buttons_suggested_admin"), qz9.g(1116, "type_fave_cart_entry_point"), qz9.g(1117, "type_paging_loader"), qz9.g(1118, "type_paging_retry"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE), "type_recommendations_carousel_error"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE), "type_recommendations_carousel_error_tall"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE), "type_primary_attachment_interactive_video"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE), "type_post_comments_dropdown"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE), "type_clip_action_button_footer"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE), "type_footer_ad_v2"), qz9.g(1119, "type_grid_attachment"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE), "type_suggested_videos_single_skeleton"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE), "type_suggested_videos_single_autoplay"), qz9.g(Integer.valueOf(Sdk.SDKError.Reason.MRAID_UNRECOGNIZED_COMMAND_VALUE), "type_stories_interesting_block"), qz9.g(1120, "type_progress_bar"), qz9.g(329, "type_compact_coowners_header"), qz9.g(330, "type_compact_coowners_header"), qz9.g(331, "type_compact_coowners_header"), qz9.g(350, "type_post_coowners_invite_banner"), qz9.g(336, "type_composite_single_clip_coowners_v2"), qz9.g(1121, "type_situational_post_video"), qz9.g(340, "type_lead_form"), qz9.g(342, "type_audio_attach_for_music_post"), qz9.g(346, "type_playlist_attach_for_music_post"), qz9.g(343, "type_poll_v3_attachment"), qz9.g(344, "type_primary_attachment_article_donut"), qz9.g(345, "type_primary_attachment_article_placeholder"), qz9.g(347, "type_full_action_button"), qz9.g(348, "type_chip_action_button"), qz9.g(349, "type_full_donut_goal_action_button"), qz9.g(351, "type_attachment_button_under_media"), qz9.g(352, "type_primary_attachment_mini_app_photo"), qz9.g(354, "type_my_target_native_ad_single_part"), qz9.g(367, "type_my_target_internal_native_ad_video_single_part"), qz9.g(404, "type_my_target_internal_native_ad_video"), qz9.g(Integer.valueOf(InterfaceC4413l1.a.b.e), "type_my_target_internal_native_ad_video_clip"), qz9.g(371, "type_my_target_internal_native_ad_carousel_single_part"), qz9.g(Integer.valueOf(InterfaceC4413l1.a.b.h), "type_my_target_internal_native_ad_carousel"), qz9.g(372, "type_my_target_internal_native_ad_description"), qz9.g(Integer.valueOf(InterfaceC4413l1.a.b.i), "type_my_target_internal_native_ad_bls"), qz9.g(Integer.valueOf(ApiInvocationException.ErrorCodes.FRIEND_RESTRICTION), "type_my_target_internal_native_ad_disclaimer"), qz9.g(355, "type_my_target_native_ad_loader"), qz9.g(356, "type_inner_caption"), qz9.g(357, "type_multi_track_attach_for_music_post"), qz9.g(358, "type_donut_post_teaser"), qz9.g(359, "type_optional_native_ad"), qz9.g(360, "type_optional_native_ad_loader"), qz9.g(Integer.valueOf(InterfaceC4413l1.a.b.f), "type_yandex_native_ad"), qz9.g(Integer.valueOf(InterfaceC4413l1.a.b.g), "type_yandex_native_ad_loader"), qz9.g(361, "type_recommended_game_skeleton"), qz9.g(362, "type_recommended_game_skeleton_error"), qz9.g(363, "type_clips_ozon"), qz9.g(364, "type_donut_action_button_redesigned"), qz9.g(365, "type_donut_chip_action_button_redesigned"), qz9.g(370, "type_clips_shops"), qz9.g(368, "type_composite_button"), qz9.g(22, "type_donut_horizontal_gallery_teaser"), qz9.g(23, "type_donut_image_teaser"), qz9.g(24, "type_donut_video_teaser"), qz9.g(25, "type_donut_text_teaser"), qz9.g(26, "type_donut_poll_teaser"), qz9.g(27, "type_donut_doc_teaser"), qz9.g(365, "type_donut_chip_action_button_redesigned"), qz9.g(1122, "type_deleted_suggested_post"), qz9.g(1123, "type_deleted_suggested_post_footer"), qz9.g(369, "type_disclaimer_placeholder"), qz9.g(403, "type_debug_info"), qz9.g(1124, "type_geo_posts_map"), qz9.g(410, "type_comment_regular"), qz9.g(Integer.valueOf(InterfaceC4413l1.a.b.k), "type_comment_archived"), qz9.g(412, "type_comment_video_archived"), qz9.g(413, "type_comment_reply_archived"), qz9.g(414, "type_comment_video_reply_archived"), qz9.g(415, "type_comment_reply_archived_wide"), qz9.g(Integer.valueOf(Http.StatusCode.RANGE_NOT_SATISFIABLE), "type_comment_video_reply_archived_wide"), qz9.g(417, "type_comment_reply"), qz9.g(418, "type_comment_type1_video_reply"), qz9.g(419, "type_comment_type3_video_reply"), qz9.g(420, "type_comment_reply_bar"), qz9.g(421, "type_comment_reply_wide"), qz9.g(422, "type_comment_type1_video_reply_wide"), qz9.g(423, "type_comment_type3_video_reply_wide"), qz9.g(424, "type_comment_show_more"), qz9.g(425, "type_comment_deleted_by_user"), qz9.g(426, "type_comment_deleted_by_user_video"), qz9.g(427, "type_comment_deleted_by_user_video_reply"), qz9.g(428, "type_comment_empty_clip_comments"), qz9.g(Integer.valueOf(CommonGatewayClient.CODE_TOO_MANY_REQUESTS), "type_comment_disabled_clip_comments"), qz9.g(430, "type_comment_empty_video_comments"), qz9.g(431, "type_comment_empty_tree_video_comments"), qz9.g(Integer.valueOf(Tensorflow.FRAME_WIDTH), "type_comment_disabled_video_comments"), qz9.g(433, "type_comment_regular_clip_comments"), qz9.g(434, "type_comment_type1_video_comments"), qz9.g(435, "type_comment_type1_video_wide_comments"), qz9.g(436, "type_comment_type3_video_comments"), qz9.g(437, "type_comment_type3_video_wide_comments"), qz9.g(438, "type_comment_reply_bar_wide"), qz9.g(439, "type_comment_donut_badge"), qz9.g(440, "type_comment_badge"), qz9.g(441, "type_comment_toxic_banner"), qz9.g(442, "type_comment_wall_negative_replies_placeholder"), qz9.g(443, "type_comment_wall_thread_show_more"), qz9.g(444, "type_comment_wall_thread_show_more_wide"), qz9.g(445, "type_comment_post_regular"), qz9.g(446, "type_comment_post_reply"), qz9.g(447, "type_comment_post_reply_wide"), qz9.g(448, "type_comment_post_badge"), qz9.g(449, "type_comment_post_donut_badge"), qz9.g(450, "type_comment_empty_post_comments"), qz9.g(451, "type_comment_disabled_post_comments"), qz9.g(452, "type_comment_group_post_archived"), qz9.g(Integer.valueOf(ApiInvocationException.ErrorCodes.SESSION_REQUIRED), "type_comment_reply_group_post_archived"), qz9.g(Integer.valueOf(ApiInvocationException.ErrorCodes.CENSOR_MATCH), "type_comment_reply_group_post_archived_wide"));
    }

    @Override // xsna.gzs
    public final Object invoke() {
        long elapsedRealtime;
        gut staticPreviewBitmapUseCase_delegate$lambda$2;
        switch (this.b) {
            case 0:
                Random.b.getClass();
                return Boolean.valueOf(0.01f > Random.c.i());
            case 1:
                elapsedRealtime = SystemClock.elapsedRealtime();
                return Long.valueOf(elapsedRealtime);
            case 2:
                return new ihc0(new ihc0.a(true, 2), 2039);
            case 3:
                return s3q0.a;
            case 4:
                ClipsAttachmentsComponentStub.f.getClass();
                return new com.vk.clips.attachments.api.di.c();
            case 5:
                return new ClipsGridLikedClipsListFragment.a(ClipsGridLikedClipsListFragment.class, null, null).f();
            case 6:
                qcy<Object>[] qcyVarArr = ClipsViewerComponentImpl.o0;
                return new d0d();
            case 7:
                return s3q0.a;
            case 8:
                throw at.b("Unexpected call to default provider");
            case 9:
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return izi0.m(ContactsViews.USERS, ContactsViews.CONTACTS, ContactsViews.INVITE_BY_PHONE_NUMBER, ContactsViews.HINTS, ContactsViews.EMPTY, ContactsViews.SELECTION_PREVIEW, ContactsViews.USERS_FROM_ROOT_CONVERSATION, o25.b(o25.a()) ? ContactsViews.EDU_CONTACTS : null);
            case 10:
                boolean z = DialogsFragment.u0;
                return Boolean.valueOf(o25.b(o25.a()));
            case 11:
                return new StringBuilder();
            case 12:
                return new s6g0();
            case 13:
                staticPreviewBitmapUseCase_delegate$lambda$2 = GeoStaticPreview.getStaticPreviewBitmapUseCase_delegate$lambda$2();
                return staticPreviewBitmapUseCase_delegate$lambda$2;
            case 14:
                return new Regex("/(?:id)([-0-9]+)");
            case 15:
                qcy<Object>[] qcyVarArr2 = MailSmartflowComponentImpl.a;
                return new m4s();
            case 16:
                return s3q0.a;
            case 17:
                return new p8s0(MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT);
            case 18:
                return Preference.f("music_search");
            case 19:
                return Preference.f("music_kids_mode");
            case 20:
                qcy<Object>[] qcyVarArr3 = NewsfeedFragment.J0;
                int i = y1z.a;
                LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                return Boolean.FALSE;
            case 21:
                FeedFeatures feedFeatures = FeedFeatures.FRESH_TIMER;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 22:
                pkd f = g620.f();
                pey peyVar = new pey(14);
                return fxc0.B().J().C0() ? new sxs0(peyVar) : new si50(f, peyVar);
            case 23:
                return new s290();
            case 24:
                return new p2r();
            case 25:
                return a();
            case 26:
                return Long.valueOf(ProcessorStatistics.a());
            case 27:
                return s3q0.a;
            case 28:
                return new c.C1759c();
            default:
                com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.HAVE_ACCOUNT_CREDENTIALS, null, null, null, 28);
                return s3q0.a;
        }
    }
}
